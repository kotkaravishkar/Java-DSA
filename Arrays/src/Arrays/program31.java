package Arrays;

import java.util.Arrays;

public class program31 {
    public static void main(String[] args) {
        int [] arr = {1,5,4,2,3};
        plusone(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] plusone(int [] arr){

        int n = arr.length;

        for (int i = n-1; i >=0 ; i--) {
            if (arr[i]!=9){
                arr[i]++;
                break;
            }
            else{
                arr[i] =0;
            }
        }
        if(arr[0]==0){
            int [] res =  new int[n+1];
            res[0]=1;
            return res;
        }

        return  arr;

    }}
