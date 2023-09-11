package practice;

public class Maximum {
    public static void main(String[] args) {
        int a = 120;
        int b = -50;

        int max = maximum(a, b);
        System.out.println("Максимум это:" + max);

        int c = 60;
        int max3 = maximum3(a, b, c);
        System.out.println("Максимум из 3-х чисел это: " + max3);
    }

    public static int maximum(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
        public static int maximum3 ( int a, int b, int с){
            int max3 = 0;
            if (a > b & a > с) {
                max3 = a;
            }
            if (b > a & b > с) {
                max3 = b;
            }
            if (с > a & с > b) {
                max3 = с;
            }
            return max3;
        }
    }

