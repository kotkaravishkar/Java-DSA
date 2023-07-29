package Arrays;

public class program22 {
    public static void main(String[] args) {

        int [] arr = {1,3,4,5};
        int n = arr.length+13;
        int ExpectedTotal = (n*(n+1))/2;
        int total = 0;

        for (int i = 0; i <arr.length; i++) {
            total = total+arr[i];
        }
        System.out.println(total);
        System.out.println(ExpectedTotal-total);

    }
}
