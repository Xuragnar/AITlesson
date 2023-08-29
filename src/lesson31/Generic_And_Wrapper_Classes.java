package lesson31;

public class Generic_And_Wrapper_Classes {

    //классы обертки Wrapper Classes

    public static void main(String[] args) {
        Integer one = new Integer(1);
        System.out.println(one);

        Integer two = Integer.valueOf(2);
        System.out.println(two);

        int twoPrimitive = two.intValue();
        System.out.println(twoPrimitive);

        //autoboxing and unboxing

        Integer five = 5;
        Integer six = new Integer(6);
        int res = getSquare(six);
        System.out.println(res);

        Integer value=Integer.valueOf(128);
        Integer value1=Integer.valueOf(128);
        System.out.println(value.equals(value1));

        Integer value2=Integer.valueOf(127);
        Integer value3=Integer.valueOf(127);
        System.out.println(value2==value3);


    }

    public static int getSquare(int i) {
        return i * i;
    }
}
