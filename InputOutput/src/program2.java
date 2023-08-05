//Input take through the BufferedReader and InputStreamReader :

import java.io.*;

public class program2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name ");
        String name = br.readLine();

        System.out.println("Enter the Age");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
