package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class ToDoList {
    private HashMap<User, Items[]> lstOfItems = new HashMap<User, Items[]>();

    private Items [] items = new Items[10];

    public Items[] getItems() {
        return items;
    }

    public HashMap<User, Items[]> addItemsToUser(User user, Items item, boolean sendEmail) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        if (user.userIsValid()  && item.contenuIsValid()) {
            if (items[0] == null) {
                items[0] = item;
            } else {
                for (int i = 1; i < items.length; i++) {
                    if (i == 7) {
                        if (sendEmail) {
                            System.out.println("Le mail a été envoyé à "+ user.getMail());
                        }
                    }

                    if (items[i] == null) {
                        if ((localTime.getHour() - items[i - 1].getTimeOfCreation().getHour()) != 0 || (localTime.getMinute() - items[i - 1].getTimeOfCreation().getMinute()) >= 30) {
                            items[i] = item;
                            break;
                        } else {
                            System.out.println("Tu dois attendre encore 30 minutes pour rajouter \" "+item.getNameOfItem()+"\" à ta ToDoList\n");
                        }
                        break;
                    }
                }
            }
            this.lstOfItems.put(user,items);
        }
        return this.lstOfItems;
    }
}