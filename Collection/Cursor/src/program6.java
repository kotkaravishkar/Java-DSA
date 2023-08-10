import  java.util.*;

public class program6 {
    public static void main(String[] args) {
        ArrayList ll = new ArrayList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ListIterator li = ll.listIterator();

        while (li.hasNext()) {

            System.out.println(li.next());
        }
    }
    }