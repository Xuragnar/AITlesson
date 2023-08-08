package homework12;

public class HWork12 {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Hello", "hello", null, "test"};
        String findMe = "test";
        System.out.println(isStringInArray(strings, findMe));
    int [] ints = {23,23,4,-20,5,98,453};
    int sum =sumOfArray(ints);
        System.out.println();
    }



    public static int sumOfArray(int[]ints){
        if(ints ==null) return 0;
        int sum = 0;
        for (int value : ints ){
            sum += value;
        }
        return sum;
    }

public static int searchIndexByValueInArray(String[] strings,String str){
        if(strings==null || str ==null){
            return -1;
        }
        for (int i =0; i<strings.length;i++){
            if(strings[i]!=null && strings[i].equals(str)){
                return i;
            }
        }
    return 0;
}
    public static boolean isStringInArray(String[] strings, String str) {
        if (strings == null || str == null || str.length() == 0) {
            return false;
        }
        for (String currenString : strings) {
            if (currenString != null && currenString.equals(str)) {
                return true;
            }
        }


        return false;
    }
}
