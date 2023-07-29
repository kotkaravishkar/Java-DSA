/*
 Program 13 : Write a Java program to find the index of an array element.
 */


package Arrays;
import java.io.*;


public class program13 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];

        System.out.println("Enter the element of array : ");
        for(int i = 0; i < size;i++){

            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Find the Index of Element : ");
        int Ele = Integer.parseInt(br.readLine());
        int Index = 0;
        for(int i = 0; i < size; i++){

            if(Ele == arr[i]){
                Index = i;
            }
        }
        System.out.println("Index of " + Ele + " is " + Index);
    }
}

