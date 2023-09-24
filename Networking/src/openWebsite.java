

import java.io.*;
import java.awt.*;
import java.net.*;

public class openWebsite {
    public static void main(String[] args) throws URISyntaxException, IOException {

        URI obj = new URI("https://www.youtube.com/watch?v=Qf-TDPr0nYw&ab_channel=KunalKushwaha");

        Desktop desk = Desktop.getDesktop();
        desk.browse(obj);
    }
}