package practice;

import java.util.Scanner;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmail.com", "12345");
        System.out.println(user);
        user.setEmail("peter@gmail.com");
        System.out.println(user);
        User user1 = new User("peter@gmail.com", "Swaasf2341");
        System.out.println(user1);

    }
}
