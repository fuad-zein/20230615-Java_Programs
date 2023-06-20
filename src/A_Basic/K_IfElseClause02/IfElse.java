package A_Basic.K_IfElseClause02;

import java.util.Scanner;

public class IfElse {

  public static void main(String[] args) {
    int marksObtained, passingMarks;
    Scanner in = new Scanner(System.in);

    passingMarks = 40;

    System.out.print("\nInput marks scored by you = ");
    marksObtained = in.nextInt();

    System.out.println();
    if (marksObtained >= passingMarks) {
      System.out.println("You passed the exam...\n");
    } else {
      System.out.println("Unfortunately you failed to pass the exam!!!\n");
    }

    in.close();
  }
}
