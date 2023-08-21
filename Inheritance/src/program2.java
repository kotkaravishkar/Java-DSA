 class program2 {

     public static void main(String[] args) {
         BCCI obj = new BCCI();
     }
 }

    class ICC {
        ICC(){
            System.out.println("IN ICC");
        }
    }
    class BCCI extends ICC{
        BCCI (){
            System.out.println("IN BCCI");
        }
}
