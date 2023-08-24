public class p6_ptiority {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getPriority());

        MyThread6 obj = new MyThread6();
        obj.start();

        t1.setPriority(7);

        MyThread6 obj1 = new MyThread6();
        obj1.start();

    }
}
 class MyThread6 extends Thread {
    public void run (){

        Thread t = Thread.currentThread();

        System.out.println(t.getPriority());
    }
 }
