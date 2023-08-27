public class program7 {
    public static void main(String[] args) {
    Child4 obj = new Child4();
    obj.access();
    }
}

class Parent4 {
    int x= 10;
    static  int c = 30;
    Parent4(){

        System.out.println("In Parent Constructor");
    }
    void access(){

        System.out.println("In Parent Method");
    }
}
class Child4 extends Parent4 {
    int x = 20;

    Child4(){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println("In child Constructor");
    }

}