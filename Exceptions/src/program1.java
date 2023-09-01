import java.sql.SQLOutput;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo obj = new Demo();

        int x = sc.nextInt();

        System.out.println(obj.fun(x));
    }
}
class Demo {
    int fun(int x){
        return 10/x;

    }}

// Exception in thread "main" java.lang.ArithmeticException: / by zero