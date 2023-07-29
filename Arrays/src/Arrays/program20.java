/*
 Program 19 : Write a Java program to find the common elements between two arrays of integers.
 */
package Arrays;

import java.util.Arrays;

public class program20 {
    public static void main(String[] args) {
        int [] arr1 = {5,8,9,5,6,7};

        for (int i = 0; i < arr1.length-1 ; i++) {
            for (int j = i+1; j < arr1.length-1; j++) {
                if (arr1[i] == arr1[j]){
                    arr1[j] = arr1[j+1];
                }
            }
            }
        System.out.println(Arrays.toString(arr1));
        }
}
