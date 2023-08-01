/*
1 4 3 16
5 36 7
8 81 10

*/


public class program9 {
    public static void main(String[] args) {

            int n=4;
            int T=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    if(j%2==1){
                        System.out.print(T + " ");
                    }else{
                        System.out.print(T*T + " ");
                    }
                    T++;

                }
                System.out.println();

            }

        }
    }