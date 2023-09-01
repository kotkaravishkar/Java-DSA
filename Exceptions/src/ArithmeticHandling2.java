import java.util.Scanner;

public class ArithmeticHandling2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        try {
            System.out.println(10/x);
        }catch (ArithmeticException ae){
            System.out.println("Please Enter Non Zero Number");

        }    }
        }
