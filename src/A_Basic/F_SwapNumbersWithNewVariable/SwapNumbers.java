package A_Basic.F_SwapNumbersWithNewVariable;

import java.util.Scanner;

/*
 * swap 2 no using 3rd variable
 */
public class SwapNumbers {

  public static void main(String[] args) {
    int x, y, temp;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter X and Y:");
    System.out.print("X = ");
    x = in.nextInt();
    System.out.print("Y = ");
    y = in.nextInt();

    System.out.println();
    System.out.println("Before Swapping \nx = " + x + "\ny = " + y);

    temp = x;
    x = y;
    y = temp;

    System.out.println();
    System.out.println("After Swapping \nx = " + x + "\ny = " + y);

    in.close();
  }
}
