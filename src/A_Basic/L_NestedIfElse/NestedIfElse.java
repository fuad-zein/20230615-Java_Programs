package A_Basic.L_NestedIfElse;

import java.util.Scanner;

public class NestedIfElse {

  public static void main(String[] args) {
    int marksObtained, passingMarks;
    char grade;
    Scanner in = new Scanner(System.in);

    passingMarks = 40;

    System.out.print("\nInput marks scored by you = ");
    marksObtained = in.nextInt();

    if (marksObtained >= passingMarks) {
      if (marksObtained > 90) {
        grade = 'A';
      } else if (marksObtained > 75) {
        grade = 'B';
      } else if (marksObtained > 60) {
        grade = 'C';
      } else {
        grade = 'D';
        System.out.println(
          "You passed the exam and you grade is = " + grade + "\n"
        );
      }
    } else {
      grade = 'F';
      System.out.println("You failed and your grade is = " + grade + "\n");
    }
    in.close();
  }
}
