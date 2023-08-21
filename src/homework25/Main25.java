package homework25;

public class Main25 {
    public static void main(String[] args) {
    }

    public boolean strEndsWithAnotherStr(String str1,String str2){
        if(str1.endsWith(str2)){
            return true;
        }else {
            return false;
        }
    }

    public char[] createsCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

}


