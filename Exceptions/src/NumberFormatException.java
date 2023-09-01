import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Demo obj = new Demo();

            int t = sc.nextInt();

            System.out.println(obj.fun(t));
        }
    }
    class Demo1{
        int fun(int t){
            return t;
        }
}