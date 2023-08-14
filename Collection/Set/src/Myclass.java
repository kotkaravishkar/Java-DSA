import java.util.*;

class MyClass1 implements Comparable{

    String str = null;

    MyClass1(String str){

        this.str = str;
    }
    public int compareTo(Object obj){

        return (this.str).compareTo(obj.toString());
    }
    public String toString(){

        return str;
    }
}
class Client1{

    public static void main(String[] args){

        TreeSet t = new TreeSet();

        t.add("C2W");
        t.add("Java");
        t.add("DSA");

        System.out.println(t);
    }
}