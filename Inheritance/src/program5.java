public class program5 {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        Child2.fun();
    }
}

class Parent2 {
    void run(){
        System.out.println("In run");
    }
}

class Child2 extends Parent2{
    static void fun(){
        System.out.println("In fun");
    }
}