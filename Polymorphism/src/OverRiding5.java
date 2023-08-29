public class OverRiding5 {
    public static void main(String[] args) {

        demo Obj = new demo();
        Obj.fun("Core2Web");
        Obj.fun(new StringBuffer("Java-DSA"));

    }
}
class demo {

    void fun(String str1){

        System.out.println("String");
    }
    void fun(StringBuffer str2){

        System.out.println("StringBuffer");
    }
}