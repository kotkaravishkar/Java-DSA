/*
 Que 2 :Sort an array of 0s, 1s and 2s
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:
Input:
N = 5
arr[]= {0 2 1 2 0}

*
* */

import java.util.Arrays;

public class program2 {
    public static void main(String[] args) {
      int [] arr= {0,2,1,2,0};

     int n = arr.length;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-1 ; j++) {
                if (arr[j]>arr[i] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString( arr));



    }
}
