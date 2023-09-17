package practice;

public class Power {
    public static void main(String[] args) {
        int count = 1;
        int res = 1;
        while (count < 11) {
            res = 3 * res;//возведение в степень
            System.out.println(res + " 3 in power " + count);
            count++;
        }
    }
}
