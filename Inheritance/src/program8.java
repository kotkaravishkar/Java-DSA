

// Static Block in Parent class:


class Parent5{

    static {

        System.out.println("In Parent Static Block:");
    }
}
class Child5 extends Parent5{

    static {

        System.out.println("In Child Static Block:");
    }
}
class Program8{

    public static void main(String[] a){

        Child5 obj = new Child5();
    }
}