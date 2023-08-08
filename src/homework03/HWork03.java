public class HWork03 {
    public static void main(String[] args) {
        String myName = "Sergey";
        System.out.println("length : " + myName.length());

        String name = "Sergey";
        char firstChar = name.charAt(0);
        System.out.println("firstChar " + firstChar);
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("lastChar " + lastChar);

        String name1 = "Sergey";

        int firstCharCode = name1.charAt(0);
        int lastCharCode = name1.charAt(name1.length() - 1);

        System.out.println("Десятичный код первого символа: " + firstCharCode);
        System.out.println("Десятичный код последнего символа: " + lastCharCode);

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String str6 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println(str6 + " length : " + str6.length());

        String str7 = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println(str7 + " length : " + str7.length());

        String str8 = str6.replace("powerful", "super");
        System.out.println("Результирующая строка: " + str8);

        boolean str9 = str8.contains("age");

        System.out.println("Содержит подстроку 'age': " + str9);

        String string = "string";
        String string1 = "code";
        String string2 = "Practice";
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));



    }

}
