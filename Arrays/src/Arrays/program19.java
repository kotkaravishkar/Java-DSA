/*
 Program 19 : Write a Java program to find the common elements between two arrays of integers.
 */
package Arrays;

public class program19 {
    public static void main(String[] args) {
        int [] arr1 = {5,8,9,6,7};
        int [] arr2 = {1,5,4,2,3};

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);

                }
            }

        }
    }
}
