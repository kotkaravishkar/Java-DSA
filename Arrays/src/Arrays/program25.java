/*
 Problem 26 : #LeetCode - Easy
 	      Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
	      answer.length == nums.length.
	      answer[i] = |leftSum[i] - rightSum[i]|.
	      Where:
	      leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
	      rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
	      Return the array answer.

	      Example 1:
	      		Input:
				nums = [10,4,8,3]
	      		Output: [15,1,11,22]
	      		Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
			   	     The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

	      Example 2:
			Input:
				nums = [1]
			Output: [0]
			Explanation: The array leftSum is [0] and the array rightSum is [0].
				     The array answer is [|0 - 0|] = [0].

	      Constraints:
			1 <= nums.length <= 1000
			1 <= nums[i] <= 105
 */

package Arrays;

import java.util.Arrays;

public class program25 {
    public static void main(String[] args) {

        int [] arr = {10,4,8,3};
        int n = arr.length;
        int [] left = new int[n];
        int [] right = new int[n];

        for (int i = 1; i <n ; i++) {
            left[i] = arr[i-1]+left[i-1];
        }
        for (int i = n-2; i >=0 ; i--) {
            right[i] = right[i+1]+arr[i+1];
        }
        int [] ans = new int[n];
        for (int i = 0; i <n ; i++) {
            ans[i] = Math.abs(left[i]-right[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
