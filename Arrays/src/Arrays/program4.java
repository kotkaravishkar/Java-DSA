package Arrays;
import java.io.*;


public class program4 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array");

        int size = Integer.parseInt(br.readLine());

        int [] arr = new int[size];

        System.out.println("Enter the elements of array");
        for (int i = 0; i <size ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        for (int i = 1; i <size ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum In Array : " + max);

    }
}
