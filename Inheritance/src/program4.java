public class program4 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.info();
    }
}

class Parent1 {

    int x =10;
    Parent1(){
        System.out.println("In Parent");
    }
    void info (){
        System.out.println("In Parent Method");
    }
}
class Child1 extends Parent1 {
    int y =20;
    Child1(){
        System.out.println("In Child Method");
        System.out.println(x);
        System.out.println(y);
    }
}