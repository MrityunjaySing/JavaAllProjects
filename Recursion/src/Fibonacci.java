public class Fibonacci {
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
//        return fib(n-1)+fib(n-2);
        int priv = fib(n - 1);
        int privPrivs = fib(n - 2);
        return priv + privPrivs;
    }
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {

            System.out.println(fib(i));
        }
    }

}