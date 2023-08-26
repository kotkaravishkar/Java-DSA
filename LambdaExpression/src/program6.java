import java.util.ArrayList;

public class program6{
        public static void main(String[] a){

            ArrayList al = new ArrayList();

            al.add(10);
            al.add(20);
            al.add(30);

            System.out.println(al);
            al.forEach((data) -> System.out.println(data));
        }
}