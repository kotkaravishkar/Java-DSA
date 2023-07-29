package Arrays;
import java.io.*;


public class program16 {
    public static void main(String[] args)throws IOException{

        int []arr = {1,2,3,4,5,6};

        int Pos =2;
        int Ele = 7;

        for(int i = arr.length-1; i > Pos;i--){
            arr[i] = arr[i - 1];
        }

        arr[Pos] = Ele;
        for(int i = 0; i < arr.length;i++){

            System.out.println(arr[i]);
        }
    }
}