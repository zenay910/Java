package WEEK07;
import java.util.*;

public class Lab7b {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String side = getSide(in);\

      if(side == "a" || side == "A"){
         sideA();

      }else if(side == "b" || side == "B"){
         sideB();

      }else {
         sideC();

      }


      


      }




   private static void sideC() {
   }




   private static void sideB() {
   }




   private static void sideA() {
      getL("a");
   }




   private static void getL(String letter) {
      System.out.println("how long its " + letter);

   }




   private static String getSide(Scanner in) {
      Boolean run = true;
      String res = "";
      do {
         
         System.out.println("Enter side you wish to calculate ");
         String ans = in.nextLine();
         if(ans.equalsIgnoreCase("a")){
            res = "a";
            run = false;
         }else if(ans.equalsIgnoreCase("b")){
            res =  "b";
            run = false;
         }else if(ans.equalsIgnoreCase("c")){
            res = "c";
         }else{
            System.out.println("wrong try again");
         }
      } while (run);
      

      return res;
   }
}