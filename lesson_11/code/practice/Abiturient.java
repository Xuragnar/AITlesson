package practice;

public class Abiturient {
    public static void main(String[] args) {
        int[] marks = {2, 3, 3, 1, 4, 1, 3, 2, 1, 1, 3, 2};
        int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            //sumOfMarks = sumOfMarks + marks[i];
            sumOfMarks += marks[i];

        }
            double averageMark =(double) sumOfMarks / marks.length;
            System.out.printf("Average mark : %.2f", averageMark);
    }
}
