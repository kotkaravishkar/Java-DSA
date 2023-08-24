public class p5_sleep {
    public static void main(String[] args) throws InterruptedException {
     Mythread5 obj = new Mythread5();
     Thread t  = new Thread(obj);
     t.start();

        for (int i = 0; i <=4 ; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

class Mythread5 implements Runnable {
    public void run(){
        for (int i = 0; i <=3 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ie){

            }
        }
    }
}
