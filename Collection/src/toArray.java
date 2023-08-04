import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class toArray {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add("ABC");
        al.add(90);
        al.add(70);

        Object arr [] = al.toArray();

        System.out.println(Arrays.toString(arr));
    }
}

