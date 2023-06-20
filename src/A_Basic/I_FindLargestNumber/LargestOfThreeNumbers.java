package A_Basic.I_FindLargestNumber;

import java.util.Scanner;

public class LargestOfThreeNumbers {

  public static void main(String[] args) {
    int x, y, z;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter three integers...");
    System.out.print("x = ");
    x = in.nextInt();
    System.out.print("y = ");
    y = in.nextInt();
    System.out.print("z = ");
    z = in.nextInt();

    if (x > y && x > z) {
      System.out.println("First number is largest...");
    } else if (y > x && y > z) {
      System.out.println("Second number is largest...");
    } else if (z > x && z > y) {
      System.out.println("Third number is largest...");
    } else {
      System.out.println("Entered numbers are not distinct!!!");
    }

    in.close();
  }
}
