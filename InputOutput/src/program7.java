import java.io.*;

public class program7
{
    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the First Name : ");
        String str1 = br.readLine();
        System.out.println("First Name : " + str1);

        br.close();

        System.out.println("Enter the grade : ");
        char ch = (char)isr.read();
        System.out.println("grade : " + ch);


    }
}
