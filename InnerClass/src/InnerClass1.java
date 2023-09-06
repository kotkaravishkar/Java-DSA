public class InnerClass1 {
    public static void main(String[] args) {
        Outers obj = new Outers();
        obj.fun();

        Outers.Inner Obj1 = new Outers().new Inner();
        obj.fun();

        Outers.Inner obj2 = obj.new Inner();
        obj2.fun();
    }
}
class Outers {
    class Inner {
        void fun(){
            System.out.println();
        }
    }
    void fun () {
        System.out.println("In outer class");
    }
}