package practice;

public class ArrayAlphabet {
    public static void main(String[] args) {

        int[] arrayNum = new int[20];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = i + 1;
        }
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + ", ");
        }
        System.out.println();
        System.out.println("0 index " + arrayNum[0]);
        System.out.println("19 index " + arrayNum[19]);

        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i);//код большой буквы А латинского алфавита
        }
        //Print array
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }

    }
}
