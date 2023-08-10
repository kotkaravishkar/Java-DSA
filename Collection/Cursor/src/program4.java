import java.util.LinkedList;
import java.util.ListIterator;

public class program4 {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("ABC");
        ll.add("PQR");
        ll.add("XYZ");
        ll.add("ABC");

        ListIterator litr = ll.listIterator();

        while(litr.hasNext()){

            System.out.println(litr.next());
        }
    }
}