/*
* Que 20 : Bitonic point
Given an array Arr of n elements that is first strictly increasing and then maybe strictly
decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value.
Example 1:
Input:
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.
*/

public class program20 {
    public static void main(String[] args) {
        int arr[] = {1,15,25,45,42,21,17,12,11};
        bitonic(arr);
        System.out.println(bitonic(arr));

    }
    static int bitonic(int []arr){
        int count =0;
        int n = arr.length;

        for (int i = 1; i <n-1 ; i++) {
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                count = arr[i];
            }
        }
        return count;
    }
}