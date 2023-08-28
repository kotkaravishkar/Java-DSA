public class program1 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun();
        obj.fun(10);
    }
}
class Demo {
    void fun(){
        System.out.println("In Method 1");
    }
    void fun(int x){
        System.out.println("In method 2");
    }
}