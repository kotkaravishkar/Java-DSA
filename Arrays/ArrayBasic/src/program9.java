/*
Que 9 : Find transition Point
Given a sorted array containing only 0s and 1s, find the transition point.
Example 1:
Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition point where 1 begins

 */


public class program9 {
    public static void main(String[] args) {
        int [] arr = {0,0,0,1,1};
        System.out.println(transition(arr));


        }
        static int transition(int[]arr){
        int n = arr.length;

            for (int i = 0; i <n ; i++) {
                if (arr[i]<arr[i+1]){
                    return i+1;
                }
            }
            return -1;
    }
}
