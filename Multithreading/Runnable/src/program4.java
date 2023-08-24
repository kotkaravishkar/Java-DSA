public class program4 {
    public static void main(String[] args) {
        Mythread4 obj = new Mythread4();
        Thread t = new Thread(obj);
        t.start();

        System.out.println(Thread.currentThread().getName());
    }
}

class ABC {
    void fun (){
        System.out.println("IN Fun");
    }
}

class Mythread4 extends ABC implements Runnable {

    public void run (){
        System.out.println(Thread.currentThread().getName());
        fun();
    }
}
