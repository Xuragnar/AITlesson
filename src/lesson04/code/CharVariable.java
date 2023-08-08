public class CharVariable {
    public static void main(String[] args) {
        char a = 'A';
        char b = 0x41;
        char c = 65;
        b = 0x0041;
        char d = '\u0041';
        char e = '\u2019';


        System.out.println(a + " b :" + b + " c : " + c + " d : " + d );
        System.out.println(e);


        char ch = 'A';
        ch++;
        System.out.println(ch);


        ch = 97;
        System.out.println(ch);

        ch += 2;
        System.out.println(ch);

        int x = 1;
        int y = 5;

        x += y;
        System.out.println(x);
        x %= y;
        System.out.println(x);



    }
}
