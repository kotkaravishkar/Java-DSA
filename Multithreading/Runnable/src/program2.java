public class program2 {
    public static void main(String[] args) {
        Mythread1 obj = new Mythread1();
        
        Thread t = new Thread();
        t.start();

        for (int i = 0; i <=5 ; i++) {
            System.out.println("In Main");
        }
    }
}

class Mythread1 implements Runnable {
    
    public void run (){
        for (int i = 0; i <=5; i++) {
            System.out.println("In Run");
        }
    }
}
