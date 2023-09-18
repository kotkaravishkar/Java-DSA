/*

Que 4 : Count pairs with given sum
Given an array of N integers, and an integer K, find the number of pairs of elements in
the array whose sum is equal to K.

Example 1:
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.
*/


public class program4 {
    public static void main(String[] args) {

        int arr [] = {1, 5, 7, 1};
        int k = 6;
        int count = 0;
        int n = arr.length;

        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                if (arr[i]+arr[j] == k){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
