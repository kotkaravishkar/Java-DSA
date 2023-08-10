import java.util.LinkedList;
import java.util.ListIterator;

public class program5 {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("Avishkar");
        ll.add("Kotkar");
        ll.add("Aditya");
        ll.add("Rutvik");

        ListIterator ite = ll.listIterator();

        while (ite.hasNext()){
            if("Avishkar".equals(ite.next())){
                ite.remove();
            }
        }
        System.out.println(ll);
    }
}
