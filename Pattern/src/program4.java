//Pattern of
//1
//23
//456
//78910

public class program4 {
    public static void main(String[] args) {
        int N=1;
        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(N++ + " ");
            }
            System.out.println();
        }

    }
}
