public class p6_join {
    public static void main(String[] args) throws InterruptedException {
        Mythread6 obj = new Mythread6();
        Thread t = new Thread();

        t.start();

        t.join();

        for (int i = 0; i <=4 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }


    }
}

class Mythread6 implements Runnable {
    public void run(){

        for (int i = 0; i <3 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch (InterruptedException ie){
                System.out.println("Interrupt Exception");

            }        }
    }
}
