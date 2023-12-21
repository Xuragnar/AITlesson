package practice.post_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PostAppl {
    public static void main(String[] args) {

        Set<String> postCodes = new HashSet<>();
        do {

            System.out.println("Welcome to Post office");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input post code: ");

            String newPostCode = scanner.nextLine();
            if (postCodes.add(newPostCode)) {
                System.out.println("Post code added.");
            } else {
                System.out.println("Post code already exists");
            }
            System.out.println("Continue? Press S to stop");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("s")){
                break;
            }

        } while (true);
        System.out.println("Post codes : ");
        System.out.println(postCodes);

    }
}
