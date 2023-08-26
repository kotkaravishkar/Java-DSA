public class program2 {
    public static void main(String[] args) {
        Demo obj = (x)->{
            System.out.println("In Demo ");
        };
        obj.fun(10);
    }
}
interface Demo{
    void  fun(int x);
}
