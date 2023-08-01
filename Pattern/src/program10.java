/*
1
3 4
6 7 8
10 11 12 13
15 16 17 18 19

*/

public class program10 {
    public static void main(String[] args) {
        int N=5;
        int T=1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(T++ + " ");
            }
            T=T+1;
            System.out.println();
        }
    }
}