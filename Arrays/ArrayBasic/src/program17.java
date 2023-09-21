/*
* Que 17 : Find all Pairs with given Sum
Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to
find all pairs from both arrays whose sum is equal to X.
Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1)
and (u2,v2), if u1 < u2 then
(u1,v1) should be printed first else second.
Example 1:
Input:
A[] = {1, 2, 4, 5, 7}
B[] = {5, 6, 3, 4, 8}
X = 9
Output:
1 8
4 5
5 4
*/

public class program17 {
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 4, 5, 7};
        int [] arr2 = {5, 6, 3, 4, 8};

        sum(arr1,arr2);
    }

    static void sum(int[] arr1, int[] arr2){
        int n1= arr1.length;
        int n2= arr2.length;

        int x=9;

        for (int i = 0; i <n1; i++) {
            for (int j = 0; j <n2 ; j++) {
                if (arr1[i]+ arr2[j] == x){
                    System.out.println(arr1[i]+" " + arr2[j]);
                }
            }
        }
    }
}
