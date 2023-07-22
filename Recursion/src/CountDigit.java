public class CountDigit {
    static int cd(int n) {
        int count=0;
        if(n==0) return 0;
        return 1+cd(n / 10);

    }

    public static void main(String[] args) {
            System.out.println(cd(1234));

        }
    }
