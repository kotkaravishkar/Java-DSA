package Arrays;
import java.io.*;

 class program26 {
    void Left_Right_Diff(int arr[],int arr1[]){

        int sum1 = 0,sum2 = 0;
        int size = arr.length;

        int[] arrLeft = new int[size];
        int[] arrRight = new int[size];

        arrLeft[0] = sum1;
        arrRight[0] = sum2;

        int point = arr.length;
        for(int i = 1; i < arr.length;i++){

            sum1 = sum1 + arr[i - 1];
            arrLeft[i] = sum1;

            sum2 = sum2 + arr[point - i];
            arrRight[i] = sum2;
        }

        for(int i = 0 ; i < arr.length;i++){

            int num = arrLeft[i] - arrRight[arr.length - i - 1];
            if(num < 0){

                int mult = num * (-2);
                num = mult + num;
                arr1[i] = num;
            }else{
                arr1[i] = num;
            }
        }
    }

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        program26 obj = new program26();

        System.out.println("Enter the size of array : ");
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];

        System.out.println("Enter the Array elements : ");
        for(int i = 0 ; i < size; i++){

            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] arr1 = new int[size];
        obj.Left_Right_Diff(arr,arr1);

        System.out.println("Left and Right array Difference array : ");
        for(int i = 0 ;i < arr.length; i++){

            System.out.print(" " + arr1[i]);
        }
    }
}

