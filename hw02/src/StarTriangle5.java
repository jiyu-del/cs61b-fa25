public class StarTriangle5 {
   /**
     * Prints a right-aligned triangle of stars ('*') with 5 lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   public static void starTriangle5() {
      // TODO: Fill in this function
      int rows = 5;
      for (int i = 1; i <= rows; i++) {
         for (int j = 0; j < rows-i; j++) {
            System.out.print(" ");
         }
         for (int j = 0; j < i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
//      int lens = 5;
//      for (int i = 1; i <= lens; i++) {
//         String spa = String.valueOf(" ").repeat(lens-i);
//         String star = String.valueOf("*").repeat(i);
//         System.out.println(spa + star);
//      }
   }
   
   public static void main(String[] args) {
      starTriangle5();
   }
}