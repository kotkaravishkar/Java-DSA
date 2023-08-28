public class overloading4 {
    public static void main(String[] args) {

        Demo4 obj = new Demo4();
        obj.fun(10,20.5f);
    }
}

class Demo4{

    void fun(int x){

        System.out.println("In Method 1");
        System.out.println(x);
    }
    void fun(int x,float y){

        System.out.println("In method 2");
        System.out.println(x);
        System.out.println(y);
    }
}