/*
 Program 24 : Write a Java program to find the number of even and odd integers in a given array of integers.
 */
package Arrays;
import java.io.*;
import java.util.Arrays;

class program24{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int[] even = new int[size];
        int[] odd = new int[size];

        System.out.println("Enter the array elements : ");
        for(int i = 0; i < size; i++){

            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                even[i] = arr[i];

            } else {
                odd[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

    }
}