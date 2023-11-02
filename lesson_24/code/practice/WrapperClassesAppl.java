package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        Integer x = 1987654321;
        String st = x.toString();
        int l = st.length();
        System.out.println("Number of digits in " + x + " = " + l);
        System.out.println(x.MAX_VALUE);
        Double y = 32456.78;
        String st1 = y.toString();
        System.out.println("Number of digits in " + y + " = " + st1.length());

        int n = 20;
        Integer m = 10;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        m = m + n;
        System.out.println("m+ n = " + m);
        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println("Circle length = " + circleLength);
        System.out.printf("Circle length = %.2f ", circleLength);
        System.out.println();

        System.out.println("--------------Constants of Wrapper Classes");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Long MIN " + Long.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);


        System.out.println("-------------Not-aNumber (NaN)---------");
        double a = 20.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)) {
            System.out.println("Wrong operation or wrong result ");
        } else {
            System.out.println(a);
        }


        System.out.println("Parsing String to number");
        String str = "987654321";
        int num = Integer.parseInt(str);
        System.out.println("String = " + str + " = " + num);

        String str1 = "2.7118281828";
        double exp = Double.parseDouble(str1);
        System.out.println("Exp = " + str1 + " = " + exp);

    }
}
