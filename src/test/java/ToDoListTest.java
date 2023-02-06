import org.example.EmailSenderService;
import org.example.Items;
import org.example.ToDoList;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ToDoListTest {
    @Test
    public void TestOfaddItemsToUser() throws InterruptedException {
        User user = new User("sam","OUK","1999-04-05","sqdqsdqsd@gmail.com","Amakazzzz");

        EmailSenderService mockSendEmail = mock(EmailSenderService.class);
        when(mockSendEmail.SendMail()).thenReturn(true);


        Items item1 = new Items("ddsdsd","dsqdqsd");
        Items item2 = new Items("ddsdsd","dsqdqsd");

        ToDoList toDoList = new ToDoList();
        toDoList.addItemsToUser(user,item1,mockSendEmail.SendMail());
        toDoList.addItemsToUser(user,item2,mockSendEmail.SendMail());

        Assertions.assertNotEquals(toDoList.getItems()[0],null);
        Assertions.assertEquals(toDoList.getItems()[1],null);

        toDoList.addItemsToUser(user,item1,mockSendEmail.SendMail());
        //Simuler le temps d'attente de l'utilisateur pour rajouter son deuxième Item
        Thread.sleep(1800000);
        toDoList.addItemsToUser(user,item2,mockSendEmail.SendMail());
        Assertions.assertEquals(toDoList.getItems()[1],item2);
    }
}