public class program4 {
    public static void main(String[] args) throws InterruptedException{
        MyThread2 obj = new MyThread2();

        obj.start();

        for (int i = 0; i <=2; i++) {
            System.out.println(Thread.currentThread().getName());

            Thread.sleep(1000);
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <2 ; i++) {
            System.out.println(getName());
        }
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ie){

        }
    }
}
