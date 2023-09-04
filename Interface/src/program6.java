public class program6 {
    public static void main(String[] args) {

        Demo6 obj = new Child6();
        obj.fun();

    }
}interface Demo6{

    default void fun(){

        System.out.println("In fun");
    }
}
class Child6 implements Demo6{

    public void fun(){

        System.out.println("In fun 2");
    }
}