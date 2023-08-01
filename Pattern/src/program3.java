/*
1
1 2
1 2 3
1 2 3 4
*/


public class program3 {
    public static void main(String[] args) {

        for (int i = 0; i <4 ; i++) {
            int  n= 1;
            for (int j = 0; j <=i; j++) {
                System.out.print(n++ + " ");
            }
            System.out.println();
        }

    }
}
