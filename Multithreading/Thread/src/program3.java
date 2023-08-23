public class program3 {
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();

        obj.start();

        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread1 extends Thread {
    public void run (){
        System.out.println(Thread.currentThread().getName());
    }

}