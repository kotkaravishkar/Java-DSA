/*
 10
10 9
9 8 7
7 6 5 4
 */


public class program12 {
    public static void main(String[] args) {
        int N=4;
        int T=10;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(T-- + " ");
            }
            T=T+1;
            System.out.println();
        }
    }
}