/*Que 12 : Number of occurance
Given a sorted array Arr of size N and a number X, you need to find the number of
occurrences of X in Arr.

Example 1:
Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
*/

public class program12 {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int x =2;
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]== x){
                count++;
            }
        }
        System.out.println(x + " occurs " + count + " times in the");
    }
}
