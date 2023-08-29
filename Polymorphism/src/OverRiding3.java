public class OverRiding3 {
    public static void main(String[] args) {
        Parent3 obj = new Child3();
            obj.fun();
    }
}

class Parent3{

    Parent3(){

        System.out.println("In Parebnt Constructor:");
    }
    void fun(){

        System.out.println("In Parent method");
    }
}
class Child3 extends Parent3{

    Child3(){

        System.out.println("In Child Constructor");
    }
    void fun(int x){                                   // It gives The Parent method Because Child take the method from parent by inheritance

        System.out.println("In Child Method");
    }
}