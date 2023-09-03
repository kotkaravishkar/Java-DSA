public class program5 {
    public static void main(String[] args) {
        Demo1.fun();

    }
}


interface Demo1{

    static void fun(){

        System.out.println("In fun");
    }
}
class Child2 implements Demo1{


}
