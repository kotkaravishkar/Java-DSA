/*Que 5 : Peak Elements
An element is called a peak element if its value is not smaller than the value of its
adjacent elements(if they exist).
Given an array arr[] of size N, Return the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct.
Otherwise, output will be 0.

Example 1:
Input:
N = 3
arr[] = {1,2,3}
Possible Answer: 2
Generated Output: 1
Explanation: index 2 is 3. It is the peak element as it is greater than its neighbor
2. If 2 is returned then the generated output will be 1 else 0.
*/

public class program5 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        peak(arr);
        System.out.println(peak(arr));

    }

        static int peak (int arr []) {
            int n = arr.length;

            for (int i = 1; i < n - 1; i++) {
                if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                    return arr[i];
                }
            }
        return 0;
    }
    }
