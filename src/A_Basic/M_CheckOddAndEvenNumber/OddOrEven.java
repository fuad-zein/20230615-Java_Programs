package A_Basic.M_CheckOddAndEvenNumber;

import java.util.Scanner;

public class OddOrEven {

  public static void main(String[] args) {
    int x;
    Scanner in = new Scanner(System.in);

    System.out.print("\nEnter a number = ");
    x = in.nextInt();

    if (x % 2 == 0) {
      System.out.println("You entered an even number...\n");
    } else {
      System.out.println("You entered an odd number...\n");
    }

    in.close();
  }
}
