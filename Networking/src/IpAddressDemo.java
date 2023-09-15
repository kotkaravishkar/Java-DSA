import java.net.*;
import java.io.*;


public class IpAddressDemo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String site = br.readLine();

        InetAddress  ip = InetAddress.getByName(site);

        System.out.println("IP Address = " + ip);
    }
}

