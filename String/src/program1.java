public class program1 {
    public static void main(String[] args) {
        String a = "Avishkar";

        char [] arr = a.toCharArray();
        int count =0;

        for (int i = 1; i < arr.length ; i++) {
            count++;
        }
        System.out.println(count);
    }

}
