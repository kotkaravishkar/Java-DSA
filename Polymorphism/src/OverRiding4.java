public class OverRiding4 {
    public static void main(String[] args) {
    Parent4 obj = new Child4();
    obj.fun(10);
    }
}

class Parent4 {
    Parent4(){

        System.out.println("In Parebnt Constructor:");
    }
    void fun(int x){

        System.out.println("In Parent method");
    }
}
class Child4 extends Parent4 {
    Child4(){

        System.out.println("In Child Constructor");
    }
    void fun(){

        System.out.println("In Child Method");
    }
}