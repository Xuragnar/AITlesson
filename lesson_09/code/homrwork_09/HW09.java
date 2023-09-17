package homrwork_09;

public class HW09 {
    public static void main(String[] args) {
        // Распечатайте все числа меньшие 200 и кратные 13.
        int count = 1;
        while (count < 200) {
            if (count % 13 == 0){
                System.out.println(count);
            }
                count++;
        }
    }
}
