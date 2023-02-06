import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    User user1 = new User("ddddd","ddddd","2020-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");
    User user2 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");
    User user3 = new User("ddddd","","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user4 = new User("   ","dddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user5 = new User("dddddd","dddddd","1998-05-02","hsqgdjgssqhdgmail.com","qKjDjhds");

    User user6 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qhds");

    User user7 = new User("ddddd","","1998-05-02",null,"qKjDjhds");
    User user8 = new User("ddddd","","1998-05-02","","qKjDjhds");
    User user9 = new User("ddddd","","1998-05-02","  ","qKjDjhds");

    User user10 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user11 = new User("","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user12 = new User(null,"ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user13 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user14 = new User("ddddd","","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user15 = new User("ddddd",null,"1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user16 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");
    User user17 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qjjhds");
    User user18 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjD");
    User user19 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","");
    User user20 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com",null);

    User user21 = new User("ddddd","ddddd","1998-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user22 = new User("ddddd","ddddd","2022-05-02","hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user23 = new User("ddddd","ddddd",null,"hsqgdjgssqhd@gmail.com","qKjDjhds");

    User user24 = new User("ddddd","ddddd","2021","hsqgdjgssqhd@gmail.com","qKjDjhds");
    @Test
    public void TestOfMailIsValid () {
        Assertions.assertTrue(user1.mailIsValid());
        Assertions.assertFalse(user5.mailIsValid());
        Assertions.assertFalse(user7.mailIsValid());
        Assertions.assertFalse(user8.mailIsValid());
        Assertions.assertFalse(user9.mailIsValid());
    }

    @Test
    public void TestOfLastNameIsValid ()  {
        Assertions.assertTrue(user10.lastNameIsValid());
        Assertions.assertFalse(user11.lastNameIsValid());
        Assertions.assertFalse(user12.lastNameIsValid());
    }

    @Test
    public void TestOfFirstNameIsValid() {
        Assertions.assertTrue(user13.firstNameIsValid());
        Assertions.assertFalse(user14.firstNameIsValid());
        Assertions.assertFalse(user15.firstNameIsValid());
    }

    @Test
    public void TestOfPassewordIsValid () {
        Assertions.assertTrue(user16.passewordIsValid());
        Assertions.assertFalse(user17.passewordIsValid());
        Assertions.assertFalse(user18.passewordIsValid());
        Assertions.assertFalse(user19.passewordIsValid());
        Assertions.assertFalse(user20.passewordIsValid());
    }

    @Test
    public void TestOfDayOfBirthdayIsValid () {
        Assertions.assertTrue(user21.dayOfBirthdayIsValid());
        Assertions.assertFalse(user22.dayOfBirthdayIsValid());
        Assertions.assertFalse(user23.dayOfBirthdayIsValid());
        Assertions.assertFalse(user24.dayOfBirthdayIsValid());
    }

    @Test
    public void TestOfUserIsValid () {
        Assertions.assertFalse(user1.userIsValid());
        Assertions.assertTrue(user2.userIsValid());
        Assertions.assertFalse(user3.userIsValid());
        Assertions.assertFalse(user4.userIsValid());
        Assertions.assertFalse(user5.userIsValid());
        Assertions.assertFalse(user6.userIsValid());
    }
}
