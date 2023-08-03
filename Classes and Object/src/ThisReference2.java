public class ThisReference2 {

    int x= 20;
     ThisReference2(){
         System.out.println(this.x);
         System.out.println(x);
         System.out.println("745");
     }
     ThisReference2(int x){
         System.out.println(this.x);
         System.out.println(x);
         System.out.println("865");
     }

    public static void main(String[] args) {

         ThisReference2 obj = new ThisReference2();
        System.out.println("-------------------------");
         ThisReference2 obj2 = new ThisReference2();
    }
}
