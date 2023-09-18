/*  Que 1 : Missing number in array
        Given an array of size N-1 such that it only contains distinct integers in the range of 1 to
        N. Find the missing element.

        Example 1:
        Input:
        N = 6
        A[] = {1,2,4,5,6}
        Output: 3
*/


import java.util.Arrays;

public class program1 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};

        System.out.println((missingNumber(arr)));

    }
    public static int missingNumber(int[] arr) {

        int n = arr.length;
        int expectedTotal = (n*(n+1))/2;
        int total = 0;

        for (int num:arr) {
            total+= num;
        }

    return expectedTotal - total;
    }
    }
