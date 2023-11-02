package practice;

public class AgeOfStudents {
    public static void main(String[] args) {
        int[] ageOfStudent = {30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34, 29, 22, 18};
        //looking max element
        int max = ageOfStudent[0];// first candidate max
        int indexMax = 0;
        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] > max) {//когда текущий элемент массива будет больше ,чем max
                max = ageOfStudent[i];
                indexMax = i;
            }
        }
        System.out.println("Max age : " + max);
        System.out.println("Index of max element : " + indexMax);
        int min = ageOfStudent[0];
        int indexMin = 0;
        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] < min) {//когда текущий элемент массива будет меньше,чем min
                min = ageOfStudent[i];
                indexMin = i;
            }
        }
        System.out.println("Min age : " + min);
        System.out.println("Index of min element : " + indexMin);
        // ищем дубликаты
        //идем по всем элементам массива,начиная с 0 го и для него ищем совпадения
        // ответ выглядит так : есть дубликат ,его индекс  - ... всего таких дубликатов - ...
        int dublicate = ageOfStudent[0];//кандидат на дубликата
        int dCount = 0;// счетчик дубликатов
        int index = 0;
        for (int i = 0; i < ageOfStudent.length; i++) {
            for (int j = i + 1; j < ageOfStudent.length; j++) {
                if (ageOfStudent[i] == ageOfStudent[j]) {
                    dublicate = ageOfStudent[i];
                    dCount++;
                    index = j;
                    System.out.println("Duplicate : " + dublicate + " index " + index);
                    System.out.println("Quality of duplicate : " + dCount);
                }
            }
        }

    }
}
