public class program4 {
    public static void main(String[] args) {

        Parent3 obj = new Child3();
        obj.run();
        obj.bun();
    }
}

interface Parent2{

    void fun();

    void gun();
}
interface Parent3{

    void run();

    void bun();
}
class Child3 implements Parent2,Parent3{

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