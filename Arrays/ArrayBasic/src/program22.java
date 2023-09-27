/*
* Que 22 : Left most and right most index

Given a sorted array with possibly duplicate elements. The task is to find indexes of first
and last occurrences of an element X in the given array.
Note: If the element is not present in the array return {-1,-1} as a pair.

Example 1:
Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of the first occurrence of 5 is 2 and the index of the last occurrence of 5 is 5.
*/


import java.util.logging.Level;

public class program22 {
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(LeftRight(arr));

        LeftRight(arr);
    }
    static int LeftRight(int[] arr){
        int n = arr.length;
        int left =0;
        int right =0;
        int x = 5;

        for (int i = 0; i <n; i++) {
            if(arr[i]== x){
                left = i;
            }
        }
return left;

    }}
