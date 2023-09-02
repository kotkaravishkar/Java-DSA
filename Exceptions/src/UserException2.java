import java.util.Scanner;

public class UserException2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");

        int Age = sc.nextInt();

        if(Age>18){
            throw new OverAgeException("Age should be more thn 18");
        }
        if (Age<18){
                    throw new UnderAgeException("You are UnderAge")    ;
        }
    }
}

class UnderAgeException extends RuntimeException{
    UnderAgeException(String str){
        super(str);

    }}

class OverAgeException extends RuntimeException {
    OverAgeException(String str){
        super(str);
    }
}
