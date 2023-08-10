import java.util.Enumeration;
import java.util.Vector;

public class program1 {
    public static void main(String[] args) {

        Vector vs = new Vector();

        vs.add(10);
        vs.add(20);
        vs.add(30);
        vs.add(40);

        Enumeration en = vs.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

    }
}
