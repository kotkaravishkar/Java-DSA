public class OverRiding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.info();
        obj.system();
    }
}
class Parent {
    Parent(){
        System.out.println("In Parent Constructor");
    }
    void info(){
        System.out.println("ABC, Core2Web");
    }
    void system(){
        System.out.println("Incubator");
    }
}
class Child extends Parent {
    Child(){
        System.out.println("In child Constructor");
    }
    void system(){
        System.out.println("BeinCaps");
    }
}