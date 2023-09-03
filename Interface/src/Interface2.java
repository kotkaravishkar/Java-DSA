public class Interface2 {
    public static void main(String[] args) {

    child2 obj = new child2();
		obj.fun();
		obj.gun();
}
}

interface Parent{

    void fun();
    void gun();
}
abstract class child implements Parent{

    public void fun(){

        System.out.println("In fun");
    }
}
class child2 extends child{

    public void gun(){

        System.out.println("In gun");
    }
}