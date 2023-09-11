public class InnerClass4 {
    public static void main(String[] args) {

        Demo1 obj = new Demo1();
        obj.m1();
        obj.m2();
    }
}

class Demo1{

    void m1(){dd

        System.out.println("Core2Web");

        class Inner{

            void m3(){

                System.out.println("Java");
            }
        }
        Inner obj1 = new Inner();
        obj1.m3();
    }
    void m2(){

        System.out.println("C2W");
    }
}