public class p7_setName {
    public static void main(String[] args) {
        Mythread7 obj = new Mythread7();

        Thread t = new Thread(obj,"My Thread");

        t.start();
    }
}

class Mythread7 implements Runnable {
    public void run (){
        System.out.println(Thread.currentThread().getName());
    }
}
