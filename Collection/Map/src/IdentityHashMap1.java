import java.util.IdentityHashMap;

public class IdentityHashMap1 {
    public static void main(String[] args) {
        IdentityHashMap IP = new IdentityHashMap();

        IP.put("Avishkar",18);
        IP.put("Kotkar",28);
        IP.put("Java",18);

        System.out.println(IP);
    }
}

// In HashMap we cannot use dublicate Key value
// but in IdentityHashMap we use dublicate Key :
