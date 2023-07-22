package Parmutation;

public class PrintAllParmutation {
    public static  String swap(String str, int i, int j){
        char[] charArray= str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void main(String[] args){
                
    }
}
