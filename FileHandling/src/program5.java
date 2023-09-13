import java.io.*;


public class program5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Code.txt");

        fw.write("Flutter");
        fw.write("BackEnd");
        fw.write("FrontEnd");

        fw.close();
        //fw.flush();
    }
}