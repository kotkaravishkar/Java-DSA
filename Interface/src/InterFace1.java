public class InterFace1 {
        public static void main(String[] args) {
            Child obj = new Child();
            obj.fun();
            obj.gun();

        }
    }

    interface Demo {
        void fun();
        void gun();
        void run();
    }

    class Child implements Demo {
        public void fun(){
            System.out.println("In Fun");
        }
        public void gun(){
            System.out.println("In gun");
        }
        public void run(){
            System.out.println("In Run");
        }
    }

