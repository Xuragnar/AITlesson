package practice;

public class Apples {
    public static void main(String[] args) {

        int apples = 30;//стартовые значения
        int counter = 0;// счетчик
        int applesInCycle = apples; //параметр

        while (applesInCycle > 0) {
            //тело цикла
            System.out.println("take 1 apple from basket");
            applesInCycle--;// изменяем параметр цикла
            // applesInCycle = applesInCycle - 1;
            counter++;// количество выполненных операций
            System.out.println("The rest of apples "+counter);
        }
        System.out.println("The job is done, total apples " + counter + " added in pei " + apples + " in basket");
    }
}
