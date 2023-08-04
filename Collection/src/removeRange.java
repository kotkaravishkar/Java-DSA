import java.util.ArrayList;

public class removeRange extends ArrayList {
    public static void main(String[] args) {

        removeRange al = new removeRange();

        al.add(10);
        al.add(20.5f);
        al.add("Avishkar");
        al.add(40);
        al.add("Kotkar");

        System.out.println(al);

        al.removeRange(1,3);

        System.out.println(al);
    }
}
