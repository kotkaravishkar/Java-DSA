/*
*
Que 6 : Second Largest
Given an array Arr of size N, print the second largest distinct element from an array.

Example 1:
Input:
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the array is 35 and the second largest element
is 34.
*/


import java.util.Arrays;

public class program6 {
    public static void main(String[] args) {

        int [] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(second(arr));;
    }

    static int second(int[] arr ){

        int n = arr.length;

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i] <arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr[n-2];
    }

}
