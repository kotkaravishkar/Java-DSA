// MyConcat :

import java.io.*;

class program13 {

    String myConcat(String str1, String str2) {

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        char arr[] = new char[arr1.length + arr2.length];

        int itr = 0;
        for(int i = 0; i < arr1.length; i++){

            arr[itr] = arr1[i];
            itr++;
        }
        for(int i = 0 ; i < arr2.length; i++){

            arr[itr] = arr2[i];
            itr++;
        }

        String str = new String(arr);
        return str;
    }
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        program13 obj = new program13();

        System.out.println("Enter 1st String : ");
        String str1 = br.readLine();

        System.out.println("Enter 2nd String : ");
        String str2 = br.readLine();

        String str = obj.myConcat(str1,str2);
        System.out.println(str);
    }
}