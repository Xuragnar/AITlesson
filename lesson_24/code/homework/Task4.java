package homework;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            double maxSize = 0;
            double minSize = 0;

            if ("byte".equals(args[i])) {
                maxSize = Byte.MAX_VALUE;
                minSize = Byte.MIN_VALUE;
            } else if ("short".equals(args[i])) {
                maxSize = Short.MAX_VALUE;
                minSize = Short.MIN_VALUE;
            } else if ("char".equals(args[i])) {
                maxSize = Character.MAX_VALUE;
                minSize = Character.MIN_VALUE;
            } else if ("int".equals(args[i])) {
                maxSize = Integer.MAX_VALUE;
                minSize = Integer.MIN_VALUE;
            } else if ("long".equals(args[i])) {
                maxSize = Long.MAX_VALUE;
                minSize = Long.MIN_VALUE;
            } else if ("float".equals(args[i])) {
                maxSize = Float.MAX_VALUE;
                minSize = Float.MIN_VALUE;
            } else if ("double".equals(args[i])) {
                maxSize = Double.MAX_VALUE;
                minSize = Double.MIN_VALUE;
            } else {
                System.out.println("Invalid type");
                continue;
            }

            System.out.println("Type: " + args[i] + ":\t min value = " + minSize + " max value = " + maxSize);
        }
    }
}



