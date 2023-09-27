/*
* Que 21 : Non Repeating Element
Find the first non-repeating element in a given array Arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Example 1:
Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once.
Hence, the output is 3.
*/



public class program21 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};

        System.out.println(NonRepeat(arr));
    }

    static int NonRepeat(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
                if (j == n) {
                    return arr[i];
                }
            }
        }
        return -1;

    }
}
