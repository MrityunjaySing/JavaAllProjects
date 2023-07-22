public class Recursion {
    public static void main(String[] args) {
        fun1();
    }
    static void fun1(){
        fun2();
        System.out.println(1);
    }
    static void fun2(){
        fun3();
        System.out.println(2);
    }
    static void fun3(){
        fun4();
        System.out.println(3);
    }
    static void fun4(){

        System.out.println(4);
    }
}
