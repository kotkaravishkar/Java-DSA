public class overloading5 {
    public static void main(String[] args) {
        Demo5 obj = new Demo5();
        obj.fun(10,20f); // Instead of this we pass like( ibj.fun(10,20)) It gives an error ambigous
    }
}
class Demo5{

    void fun(float y,int x){

        System.out.println("In Method 1");
        System.out.println(x);
    }
    void fun(int x,float y){

        System.out.println("In method 2");
        System.out.println(x);
        System.out.println(y);
    }
}

