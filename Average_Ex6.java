import java.util.Scanner;
public class Average_Ex6 {
   // main method
   public static void main(String[] arg){
   Scanner input = new Scanner(System.in);
   
   double digA, digB, digC, digD;
   
   System.out.print("Integer 1?.....");
      digA = input.nextDouble();
      
   System.out.print("Integer 2?.....");
      digB = input.nextDouble();
   
   System.out.print("Integer 3?.....");
      digC = input.nextDouble();
   System.out.printf("The average of 3 integers is %.3f", average(digA, digB, digC) );
   
   System.out.println("");
   System.out.printf("\nAnother integer please?...");
      digD = input.nextDouble();
   System.out.printf("The average of 4 integers is %.3f", average(digA, digB, digC, digD) );

   } // end of main method
   
   // method for average of 3 integers
   public static double average (double digA, double digB, double digC) {
      double av1 = (digA + digB + digC) / 3;   
      return av1; }
      
   public static double average (double digA, double digB, double digC, double digD) {
      double av1 = (digA + digB + digC + digD) / 4;   
      return av1; }
   
} // main method ends here

