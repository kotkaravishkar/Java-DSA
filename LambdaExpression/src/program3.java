public class program3 {
    public static void main(String[] args) {
        Example obj = (name1, name2) -> "Avishkar Kotkar" + ":" + name1 + "//" + "Kotkar" + ":"+ name2;
    obj.fun("one","two");
    }
}

interface Example {
    String fun(String name1, String Name2);
}

