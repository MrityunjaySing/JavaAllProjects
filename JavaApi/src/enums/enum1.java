package enums;

enum Week{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class enum1 {
    enum Result{
        PASS,FAIL,NR;
    }
    public static void main(String[] args) {
        Week w=Week.MON;
        System.out.println(w);
        Result r = Result.PASS;
        System.out.println(r);
    }
}
