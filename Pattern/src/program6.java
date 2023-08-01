/*
1
4 9
16 25 36
49 64 81 100
*/

public class program6 {
    public static void main(String[] args) {

        int N=1;

        for (int i = N; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(N*N + " ");
                N++;
            }
            System.out.println();
        }
    }
}
