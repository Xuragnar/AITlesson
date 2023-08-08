package lesson10;

public class For {
    public static void main(String[] args) {
        //       for([начальные знаяения ];[условия];[изменение состояния];){

        int j = 0;
        while (j < 10) {
            System.out.print(j);
            j++;
        }
        System.out.println();
        System.out.println("End while loop");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("End for loop");
        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(j);
        }
        for (int i = 10; i >= 0; i = i - 1) {
            System.out.println(i + " ");
        }
        int[] array = {5, 10, 43, 545, -10, -23, 0, 15};
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k] + " ");
        }
        System.out.println("End array");
        for (int i = 5; i <= 20; i = i + 1) {
            System.out.println(i + " ");
        }
        int forSearch = 545;
        int index = -1;

        for (int k = 0; k < array.length; k++) {
            if (array[k] == forSearch) {
                index = k;
                System.out.println("Sovpadenie naideno");
                break;
            } else {

                System.out.println("Chislo " + array[k] + " ne ravno " + forSearch);
            }


        }
        System.out.println(index);
        for (int k = 0; k < 10; k++) {
            System.out.print(k + ": ");
            for (int l = 0; l < 5; l++) {
                if (k == 3) break;
                System.out.print(l + " ");
            }
            System.out.println();
        }

    }
}
