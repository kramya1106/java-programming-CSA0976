import java.util.Scanner;

public class StudentGrade {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      int marks[] = new int[4];
      int total = 0;

      System.out.println("Enter the marks for 4 subjects:");
      for(int i=0; i<4; i++) {
         marks[i] = input.nextInt();
         total += marks[i];
      }

      float aggregate = total / 4.0f;
      System.out.println("Total marks: " + total);
      System.out.println("Aggregate: " + aggregate);

      if(aggregate >= 75) {
         System.out.println("Grade: Distinction");
      } else if(aggregate >= 60) {
         System.out.println("Grade: First Division");
      } else if(aggregate >= 50) {
         System.out.println("Grade: Second Division");
      } else if(aggregate >= 40) {
         System.out.println("Grade: Third Division");
      } else {
         System.out.println("Grade: Fail");
      }
   }
}
