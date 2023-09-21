/*
* Que 18 : Move all zero two the end of Array
Given an array arr[] of N positive integers. Push all the zeros of the given array to the
right end of the array while maintaining the order of non-zero elements.

Example 1:
Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements preserve their order while the 0 elements are
moved to the right.
*/


import java.util.Arrays;

public class program18 {
    public static void main(String[] args) {

        int[] arr = {3, 5, 0, 0, 4};
        int n = arr.length;

        move(arr);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static void move(int[] arr) {
        int n = arr.length;

        int count = 0;


        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n)
            arr[count++] = 0;
    }
}