import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        // add()
        al.add(10);
        al.add(20);
        al.add("Avishkar");

        System.out.println(al);

        //Size
        System.out.println(al.size());

        //contains
        System.out.println(al.contains("Avishkar"));

        ArrayList al2 = new ArrayList();

        al2.add(30);
        al2.add(40);
        al2.add("Kotkar");

        System.out.println(al2);

        //adAll()
        al.addAll(al2);
        System.out.println(al);
        //set()
        al.set(2,"XYZ");
        System.out.println(al);

        //get
        System.out.println(al.get(2));

        //indexOf

        System.out.println(al.indexOf("Kotkar"));

        //remove

        al.remove("Kotkar");
        System.out.println(al);
    }
}
