/*
1 A 2 B
C 3 D
4 E
F
 */

public class program8 {
    public static void main(String[] args) {
        int N = 1;
        char ch ='A';

        for (int i = 4; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                if (j%2==0){
                    System.out.print(N++ + " ");

                }
            else {
                    System.out.print(ch++ +" ");
                }
            }
            System.out.println();

        }
    }
}
