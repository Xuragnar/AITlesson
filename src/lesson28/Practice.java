package lesson28;

public class Practice {

    public static void main(String[] args) {
        "Hello".substring(1,3);

    }

    public static String mySubstring(String string,int begin,int end){
        StringBuilder sb = new StringBuilder();
        for(int i = begin;i<string.length()&& i <end;i++){
            sb=sb.append(string.charAt(i));
        }
        return new String(sb);
    }
}
