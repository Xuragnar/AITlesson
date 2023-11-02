package practice;

public class StringBuilderAppl {
    public StringBuilderAppl(String java) {

    }

    public static void main(String[] args) {

        String str = "Java";
        // str = str + "_" + 11
        str = str.concat("_");
        str = str.concat("" + 11);
        System.out.println(str);


        StringBuilder sb = new StringBuilder("Java");
        sb.append("_").append(11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        str=sb.toString();
        System.out.println(str);
    }
}
