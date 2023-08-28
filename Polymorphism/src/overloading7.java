public class overloading7 {
    public static void main(String[] args) {

        Demo7 obj = new Demo7();
        obj.fun("ABC");
        obj.fun(new StringBuffer("Core2Web"));
        obj.fun(null);
    }
}
class Demo7{

    void fun(Object obj){

        System.out.println("Object");
    }
    void fun(String str1){

        System.out.println("String");
    }
}