import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class mapIterator {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap();

        tm.put("Avishkar", "18");
        tm.put("ABC", "78");
        tm.put("PQR", "18");
        tm.put("XYZ", "18");

        Set<Map.Entry> data = tm.entrySet();

        Iterator<Map.Entry> itr = data.iterator();


        while(itr.hasNext()){

            Map.Entry abc = itr.next();

            System.out.println(abc.getKey() + ":" + abc.getValue());
        }
    }

    }
