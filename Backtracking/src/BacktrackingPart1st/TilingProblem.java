package BacktrackingPart1st;

public class TilingProblem {
    public static  int getWay(int n){
        //basecase
        if(n <=3){
            return  n;
        }
        // recursive case
        return getWay(n-1)+getWay(n-2);
    }
    public static void main(String[] args) {
        System.out.println("for n=1, total ways = " +getWay(1));
        System.out.println("for n=2, total ways = " +getWay(2));
        System.out.println("for n=3, total ways = " +getWay(3));
        System.out.println("for n=4, total ways = " +getWay(4));

    }
}
