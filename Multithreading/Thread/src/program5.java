class Demo extends Thread{

    public void run(){

        System.out.println(getName());
    }
}
class MyThread3 extends Thread{

    public void run(){

        System.out.println(getName());

        Demo obj1 = new Demo();
        obj1.start();
    }
}
class program5{

    public static void main(String[] a){

        MyThread3 obj = new MyThread3();
        obj.start();

        System.out.println(Thread.currentThread().getName());
    }
}