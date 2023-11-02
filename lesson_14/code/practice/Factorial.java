package practice;

public class Factorial {
    public static void main(String[] args) {
        int n = 31;
        int f = factorial(n);
        System.out.println("Factorial " + n + " = " + f);
    }


    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

}



