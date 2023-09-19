public class program7 {
    public static void main(String[] args) {
       int  [] arr = {10, 20, 30, 40, 50};
        System.out.println( sorted(arr));;


    }

    static int sorted (int [] arr){

       int n = arr.length;

        for (int i = 0; i <n ; i++) {
            if (arr[i]<arr[i+1]){
                return 1;
            }
        }

        return 0;
    }

}
