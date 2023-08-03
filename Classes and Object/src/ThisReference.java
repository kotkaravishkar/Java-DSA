 class ThisReference {

     ThisReference() {
         this(100);

         System.out.println("555");
     }
     ThisReference(int x){
         System.out.println(x);
         System.out.println(88888);
     }
     public static void main(String[] args) {

         ThisReference obj = new ThisReference();

    }

        }

