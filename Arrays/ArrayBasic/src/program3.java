/*
* : Find Duplicates in an Array
Given an array of size N which contains elements from 0 to N-1, you need to find all the
elements occurring more than once in the given array. Return the answer in ascending
order. If no such element is found, return list containing [-1].
Note: The extra space is only for the array to be returned. Try and perform all operations
within the provided array.

Example 1:
Input:
N = 4
a[] = {0,3,1,2}
Output:
-1
Explanation:
There is no repeating element in the array. Therefore, output is -1.
*/


public class program3 {
    public static void main(String[] args) {
        int[] arr = {0,3,1,2};
        System.out.println(duplicate(arr));

    }

    public static int duplicate(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
            return -1;
    }
}