package Arrays;

public class program29 {
    public static void main(String[] args) {

        int [] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        int index = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!= val){
                index++;
            }
        }
        System.out.println(index);
    }

}
