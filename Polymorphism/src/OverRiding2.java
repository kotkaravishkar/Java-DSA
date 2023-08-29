public class OverRiding2 {
    public static void main(String[] args) {

        Parent2 Obj1 = new Child2();
        Obj1.fun();
    }
}
class Parent2{
    Parent2(){	System.out.println("In Parent Constructor");
    }
    void fun(){

        System.out.println("In Parent method");
    }
}

class Child2 extends Parent2{

    Child2(){

        System.out.println("In child Constructror");
    }
    void fun(){

        System.out.println("In Child method");
    }
}
