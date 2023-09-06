public class InnerClass2 {
    public static void main(String[] args) {

            Demo obj = new Demo();
            obj.m2();
            Demo.Inner obj1 = obj.new Inner();
            obj1.m1();

        }
}

class Demo{

    void m2(){

        System.out.println("Core2Web");
    }

    class Inner{

        void m1(){

            System.out.println("Java DSA ");
        }
    }
}