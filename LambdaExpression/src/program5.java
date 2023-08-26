public class program5 {
    public static void main(String[] args) {

        Runnable run1 = new Runnable(){

            public void run(){

                System.out.println(Thread.currentThread().getName());
            }
        };
        Runnable run2 = new Runnable(){

            public void run(){

                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();
    }
}