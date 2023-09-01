import java.util.Scanner;

public class IndexOutofBoundException1 {
    public static void main(String[] args) {

        int [] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=6 ; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
