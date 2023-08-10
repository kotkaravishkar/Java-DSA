import java.util.*;

 class MyClass implements Comparable {

     String str = null;

     MyClass (String str){
         this.str = str;
     }
     @Override
     public int compareTo(Object str1) {
         return this.str.compareTo(this.str) ;
     }

     public  String toString(){
         return str;
     }
 }

 class program9 {
     public static void main(String[] args) {

         TreeSet ts = new TreeSet();

         ts.add("ABC");
         ts.add("ZYX");
         ts.add("PQR");
         ts.add("XYZ");
         ts.add("ABC");

         System.out.println(ts);
     }
 }
