
class constructor3{

    int x =10;

    String str1 = "ABC";

    void fun(){

        String str2 = "PQR";

        String str3 = "XYZ";

        System.out.println(str2);

        System.out.println(str3);
    }
    public static void main(String[] args){

        constructor3 obj = new constructor3();

        System.out.println(obj.x);

        System.out.println(obj.str1);

        obj.fun();

    }
}