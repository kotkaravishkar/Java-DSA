public class program7 {
    public static void main(String[] args) {
        Demo7 obj = new Child7();
        obj.fun();
    }
}
interface Demo7{

    default void fun(){

        System.out.println("fun-1");
    }
}
interface Demo8{

    default void fun(){

        System.out.println("fun-2");
    }
}
class Child7 implements Demo7,Demo8{

    public void fun(){

        System.out.println("In child");
    }
}
