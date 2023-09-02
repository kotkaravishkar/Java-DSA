import java.util.Scanner;

public class UserException1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int [5];

        for (int i = 0; i <5; i++) {
            int data = sc.nextInt();

        if (data < 0){
            throw new DataUnderFlowException("Enter Greater Number");
        }
        if (data >10){
            throw new DataOverFlowException("Enter Smaller Number");
        }
        arr[i] = data;
        }

    }
}
class DataOverFlowException extends RuntimeException {
    DataOverFlowException(String str){
        super(str);
    }
}

class DataUnderFlowException extends RuntimeException {
    DataUnderFlowException(String str){
        super(str);
    }
}