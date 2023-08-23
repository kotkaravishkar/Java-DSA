public class program2 {
    public static void main(String[] args) {

        Mythread obj = new Mythread();
        obj.start();

        System.out.println("In Main");
    }
}
 class Mythread extends Thread {
    public void run(){
        System.out.println("In Run");
    }
 }