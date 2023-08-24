public class SerThreadName {
    public static void main(String[] args) {

        mythread obj = new mythread();
        mythread1 obj1 = new mythread1();

        obj.start();
        obj1.start();
    }
}

class mythread extends Thread  {
    public void run(){
        System.out.println(Thread.currentThread().getName());

        setName("Avishkar");

        System.out.println(Thread.currentThread().getName());
    }

}

class mythread1 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread());

        setName("Kotkar");

        System.out.println(Thread.currentThread());
    }
}
