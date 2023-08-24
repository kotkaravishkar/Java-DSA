public class program1 {
    public static void main(String[] args) {
        Mythread obj = new Mythread();

        Thread t =new Thread(obj);

        t.start();
        System.out.println("In Main");
    }
}

class Mythread implements Runnable {
    @Override
    public void run() {

        System.out.println("In Runnable");
    }
}
