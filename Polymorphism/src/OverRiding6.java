public class OverRiding6 {
    public static void main(String[] args) {

        Parent6 obj = new Child6();
        obj.fun();
    }
}
class Parent6{

    Object fun(){

        System.out.println("In Parent");
        return new Object();
    }
}
class Child6 extends Parent6{

    String fun(){

        System.out.println("In child");
        return "Prajwal";
    }
}