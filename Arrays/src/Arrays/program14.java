/*
 Program 14 : Write a Java program to remove a specific element from an array.
 	      note : Every element is Unique in array
 */

package Arrays;
import java.io.*;
import java.util.Arrays;

public class program14 {
    public static void main(String[] args)throws IOException{

        int [] arr = {4,5,2,1,6,3};
        int ele = 5;

        for (int i = 0; i < arr.length ; i++) {
            if(ele == arr[i] ){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}