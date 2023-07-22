package Oops_student;

public class Student {
    public static class Students{
        String name;
        int rno;
        double percentage;
    }
    public static class Car{
        String name;
        String price;
    }

    public static void change1(int x){
        x=7;
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = "1000000" ;

        Students st  = new Students();
        st.name ="satyam";
        st.rno=35;
        st.percentage=70;

        Students st1  = new Students();
        st1.name ="Mrityunjay";
        st1.rno=35;
        st1.percentage=70;
        System.out.println(c1.name+ " price "+ c1.price);
        System.out.println(st.name+ " roll_no " +st.rno+ " percentage " +st.percentage);
        System.out.println(st1.name+ " roll_no " +st1.rno+ " percentage " +st1.percentage);
        int x=5;
        System.out.println(x);
    }
}
