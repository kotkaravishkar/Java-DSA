public class overloading2 {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.fun(10);
    }
}
class Demo1{

void fun(int x){

    System.out.println("In Method 1");
}
    void fun(int x,float y){

        System.out.println("In method 2");
    }
}
