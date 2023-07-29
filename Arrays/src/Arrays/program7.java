/*
 Program 7 : WAP to take 1-D array from user and print the Second Largest
             element of the array.
 */

package Arrays;

import java.util.Arrays;

public class program7 {
    public static void main(String[] args) {

        int [] arr = {4,5,7,8,2,6};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);

    }
}
