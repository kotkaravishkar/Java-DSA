public class program3 {
    public static void main(String[] args) {

        Parent1 obj = new Child1();
        obj.fun();
        obj.gun();

    }
}

interface Parent1{

    void fun();
    void gun();
}

class Child1 implements Parent1{

    public void fun(){

        System.out.println("In fun");
    }
    public void gun(){

        System.out.println("In gun");
    }
}