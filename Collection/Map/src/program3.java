import java.util.HashMap;

public class program3 {
    public static void main(String[] args) {
        HashMap hs = new HashMap();

        hs.put("Avishkar","18");
        hs.put("Kotkar","9");
        hs.put("Java",28);
        hs.put("Core2Web",9);

        System.out.println(hs.get("Avishkar"));

        System.out.println(hs.keySet());
        System.out.println(hs.values());
    }
}
