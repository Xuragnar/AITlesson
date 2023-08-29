package homework31;

public class HWork31 {
    public static int countPattern(String text, String pattern) {
        int count = 0;
        int patternLength = pattern.length();

        for (int i = 0; i <= text.length() - patternLength; i++) {
            if (text.substring(i, i + patternLength).equals(pattern)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello world";
        String pattern = "l";
        int result = countPattern(text, pattern);
        System.out.println("Количество вхождений паттерна: " + result);
    }
}
