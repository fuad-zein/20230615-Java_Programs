package B_Middle.A_ReversePyramidPattern;

import java.util.Scanner;

public class ReversePyramidPattern {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int rows;

    System.out.print("\nInput your length number = ");
    rows = in.nextInt();
    System.out.println();

    for (int i = 0; i <= rows - 1; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= rows - 1 - i; k++) {
        System.out.print("*" + " ");
      }
      System.out.println();
    }
    System.out.println();
    in.close();
  }
}
