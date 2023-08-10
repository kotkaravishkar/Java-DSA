import java.util.ArrayList;
import java.util.*;

public class program2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Iterator itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
