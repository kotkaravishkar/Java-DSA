/*
* Que 19 : Elements with left side smaller and right side greater
Given an unsorted array of size N. Find the first element in the array such that all of its
left elements are smaller and all right elements to it are greater than it.
Note: Left and right side elements can be equal to required elements. And extreme
elements cannot be required.

Example 1:
Input:
N = 4
A[] = {4, 2, 5, 7}
Output:
5
Explanation:
Elements on the left of 5 are smaller than 5 and on the right of it are greater than 5.
*/



public class program19 {
    public static void main(String[] args) {

        int [] arr = {11, 9, 12};
        System.out.println(greater(arr));
    }
    static int greater(int[] arr){
        int n = arr.length;

        for (int i = 1; i <n-1 ; i++) {
            if (arr[i] < arr[i+1] && arr[i]> arr[i-1]){
                return arr[i];
            }
        }
    return -1;
    }}
