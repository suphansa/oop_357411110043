package oop_lab4;

public class TestMethods {
    //global variable
    private static int number = 1000;
    //Methods
    //type 1
    private static void A (){
     System.out.println("Hello A");
     B(20);
    }// A
   //   type 2
    private  static void  B (int x){
        System.out.println("Hello B " +x);
    }//B
//    type3
    private static int C(int x, int y){
         System.out.println("Hello C " +number);
        return x+y;
    }//C

   public static void main (String[] args) {
        System.out.println("Hello Main");
    //Callong methods
     //  A();
     //  B (10);
      int number = C(10,20);
      System.out.println(number);
      System.out.println(C(50,50));
      //Local variable
      int x = 100;
   }//main


}//class
