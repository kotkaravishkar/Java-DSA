import java.util.*;

class Demo{

    int t = 0;

    String x = null;

    Demo(int t,String x){

        this.x =x;
        this.t=t;
    }
    public String toString(){

        return x +":" +t;
    }
}

class Client{

    public static void main(String[] args){

        LinkedHashSet lh = new LinkedHashSet();

        lh.add(new Demo(10,"ABC"));
        lh.add(new Demo(20,"NMN"));
        lh.add(new Demo(30,"OLK"));
        lh.add(new Demo(40,"LLL"));

        System.out.println(lh);
    }
}