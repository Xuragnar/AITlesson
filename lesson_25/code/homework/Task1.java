package homework;

public class Task1 {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        int index = str.lastIndexOf('!');
        System.out.println(index);
        index=str.indexOf("Java");
        System.out.println(index);
        System.out.println(str.replace("o","a"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        



    }
}
