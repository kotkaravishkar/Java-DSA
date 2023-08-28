public class overloading6 {
    public static void main(String[] args) {
        Demo6 Obj = new Demo6();
        Obj.fun("ABC");
        Obj.fun(new StringBuffer("Core2Web"));
        //Obj.fun(null); This line Gives an error There is a ambigous:

    }
}

class Demo6{

    void fun(String str1){

        System.out.println("String");
    }
    void fun(StringBuffer str2){

        System.out.println("StringBuffer");
    }
}