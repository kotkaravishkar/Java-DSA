//Strong Number

public class program13 {
    public static void main(String[] args) {

        int num = 145;
        int temp = num;
        int sum = 0;

        while(num != 0){

            int rem = num % 10;
            int mul = 1;
            for(int i = 1;i <= rem; i++){

                mul = mul * i;
            }
            sum = sum + mul;
            num /= 10;
        }
        if(temp == sum){

            System.out.println(temp + " is Strong Number");
        }else{

            System.out.println(temp + " is Not Strong Number");
        }
    }
}