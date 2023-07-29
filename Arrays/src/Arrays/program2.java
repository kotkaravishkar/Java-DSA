//Program 2 : Sum of array elemnts


package Arrays;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter elements in the array");

        int sum = 0;

        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
            sum = sum+ arr[i];
    }
        System.out.println(sum);
    }
}
