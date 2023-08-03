
class Demo2{

    int x =25;

    String Name = "XYZ";

    void info(){

        System.out.println(x);

        System.out.println(Name);
    }
}
class mainDemo1{

    public static void main(String[] args){

        Demo2 obj =new Demo2();
//		Demo obj1 =new Demo();

        obj.info();

        System.out.println(obj.x);
        System.out.println(obj.Name);



    }
}