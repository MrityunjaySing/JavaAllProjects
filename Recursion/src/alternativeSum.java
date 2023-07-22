import java.util.*;
public class alternativeSum {
    public static int sum(int num1){
        if (num1 == 0){
            return 0;
        }
        if (num1%2==0){
            return sum(num1-1)-num1;

        }else{
            return sum(num1-1)+num1;
        }
    }
    public static void main(String[] args) {
        int num =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         num = sc.nextInt();
        int result = sum(num);
        System.out.println("your Alternative number is: "+result);
    }
}
