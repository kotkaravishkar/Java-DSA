import java.util.ArrayList;
import java.util.Iterator;

public class program3 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20.5);
        al.add(30.5);
        al.add("C2W");

        Iterator itr = al.iterator();

        while (itr.hasNext()){
            if ("C2W".equals(itr.next())){
                itr.remove();

            }
        }
        System.out.println(al);
    }
}
