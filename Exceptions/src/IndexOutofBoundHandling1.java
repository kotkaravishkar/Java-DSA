import java.util.Scanner;

public class IndexOutofBoundHandling1 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=6 ; i++) {

            try {
                arr[i] = sc.nextInt();
            }
            catch (RuntimeException re){
                System.out.println("Array is full");
            }
        }
    }
    }