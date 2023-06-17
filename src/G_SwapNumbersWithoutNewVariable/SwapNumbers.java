package G_SwapNumbersWithoutNewVariable;

import java.util.Scanner;

public class SwapNumbers {

  public static void main(String[] args) {
    int x, y;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter X and Y:");
    System.out.print("X = ");
    x = in.nextInt();
    System.out.print("Y = ");
    y = in.nextInt();

    System.out.println();
    System.out.println("Before Swapping \nx = " + x + "\ny = " + y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println();
    System.out.println("After Swapping \nx = " + x + "\ny = " + y);

    in.close();
  }
}
