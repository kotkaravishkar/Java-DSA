/*
 Program 1 : WAP to create 1-D array of length n from user and also take value
             from user and print whole 1-D array.
 */
package Arrays;
import java.io.*;

class program1{

    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of Array");

        int size = Integer.parseInt(br.readLine());

        int [] arr = new int [size];

        System.out.println("Enter element in Array:  ");

        for (int i = 0; i <size ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Arrays Elements: ");
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}