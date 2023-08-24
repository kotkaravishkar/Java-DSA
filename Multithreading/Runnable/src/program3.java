public class program3 {
    public static void main(String[] args) {
        Mythread3 obj = new Mythread3();
        Thread t = new Thread(obj);

        t.start();

        for (int i = 0; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Mythread3 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <=5 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}