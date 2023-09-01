import java.util.Scanner;

public class NumberFormatHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Demo obj = new Demo();

        int x=0;

        try {
            x =sc.nextInt();
        }catch (Exception ne){
            System.out.println("Enter Valid data");
        }
        System.out.println(obj.fun(x));
    }
}
class Demo2 {
    int fun(int x){
        return x;
    }
}