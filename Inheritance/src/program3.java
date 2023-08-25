public class program3 {
    public static void main(String[] args) {
    Parent obj = new Parent();
    Child obj1  = new Child();

    }
}

class Parent {
    Parent(){
        System.out.println(this);
        System.out.println("In Parent");
    }
}

class Child extends Parent {
    Child(){
        System.out.println(this);
        System.out.println("In Child");
    }
}