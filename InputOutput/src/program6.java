import java.io.*;

public class program6 {

    public static void main(String[] args)throws IOException{

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the First Name : ");
        String str1 = br1.readLine();
        System.out.println("First Name : " + str1);

        br2.close();

        System.out.println("Enter the Last Name : ");
        String str2 = br2.readLine();
        System.out.println("Last Name : " + str2);
    }

}