public class classDemo {
        String Name = "ABC XYZ";

        char Div = 'A';

        int Roll = 68;

        void info(){

            System.out.println(Name);
            System.out.println(Div);
            System.out.println(Roll);
        }
    }
    class Student{

        public static void main(String[] args){

            classDemo obj =new classDemo();

            obj.info();


        }
    }
