package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String lastName;
    private String firstName;
    private String dayOfBirthday;
    private String mail;
    private String password;
    private ToDoList toDoList;

    public User(String lastName, String firstName, String dayOfBirthday, String mail, String password) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dayOfBirthday = dayOfBirthday;
        this.mail = mail;
        this.password = password;
    }

    public ToDoList getToDoList() {
        return toDoList;
    }

    public void setToDoList(ToDoList toDoList) {
        this.toDoList = toDoList;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(String dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean lastNameIsValid() {
        return (this.lastName != null && !this.lastName.isEmpty() && !this.lastName.isBlank());
    }

    public boolean firstNameIsValid() {
        return (this.firstName != null && !this.firstName.isEmpty() && !this.firstName.isBlank());
    }

    public boolean mailIsValid() {
        if (this.mail != null && !this.mail.isEmpty() && !this.mail.isBlank()) {
            Pattern p = Pattern.compile("\\b[a-z[A-Z][0-9]]+@[a-z[A-Z][0-9]]+\\.[a-z[A-Z][0-9]]+\\b");
            Matcher m = p.matcher(this.mail);
            return m.find();
        } else {
            return false;
        }
    }

    public boolean passewordIsValid () {
        Boolean charIsUpperCase = false;
        Boolean charIsLowerCase = false;
        if (this.password != null) {
            for (char ch : this.password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    charIsUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    charIsLowerCase = true;
                }
            }
        }
        return (this.password != null && this.password.length() >= 8 && this.password.length() <= 40 && charIsUpperCase && charIsLowerCase);
    }

    public int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }
    public boolean dayOfBirthdayIsValid () {
        if (this.dayOfBirthday != null && !this.dayOfBirthday.isEmpty() && !this.dayOfBirthday.isBlank() && this.dayOfBirthday.length() >= 10) {
            LocalDate dayOfbirthday = LocalDate.parse(this.dayOfBirthday);
            return calculateAge(dayOfbirthday) >= 13;
        }
        return false;
    }

    public boolean userIsValid () {
        return (firstNameIsValid() && lastNameIsValid() && mailIsValid() && passewordIsValid() && dayOfBirthdayIsValid());
    }

}
