public class program6 {
    public static void main(String[] args) {
    Child3 obj = new Child3();
    Child3.fun();
    }
}
class Parent3 {
    void run (){
        System.out.println("In Run");
    }
}
class Child3 extends Parent3 {
    static void fun (){
        System.out.println("In fun");
    }
}