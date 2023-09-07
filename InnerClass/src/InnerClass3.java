public class InnerClass3 {
    public static void main(String[] args) {
        Parent2 obj = new Child();

//		obj.fun();
//		obj.gun();
        obj.run();
        obj.bun();
    }
}

interface Parent1{

    void fun();

    void gun();
}
interface Parent2{

    void run();

    void bun();
}
class Child implements Parent1,Parent2{

    public void fun(){

        System.out.println("In fun");
    }
    public void gun(){

        System.out.println("In gun");
    }
    public void run(){

        System.out.println("In run");
    }
    public void bun(){

        System.out.println("In bun");
    }
}