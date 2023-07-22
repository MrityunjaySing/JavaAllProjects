import java.util.Scanner;

public class powerOfElement {
    public static int powerOfElement (int a, int b){
        int mid=0, result =0, finalresult =0;
        // base case condition
        if(b==1){
            return a;
        }else {
            mid = b / 2;
            result = powerOfElement(a, mid);
            finalresult = result * result;
            if(b%2==0){
                return finalresult;
            }else{
                return finalresult*a;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = powerOfElement(a,b);
        System.out.println("your power number is: "+result);
    }
}
