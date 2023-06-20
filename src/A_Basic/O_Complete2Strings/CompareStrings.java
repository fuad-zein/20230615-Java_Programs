package A_Basic.O_Complete2Strings;

import java.util.Scanner;

public class CompareStrings {

  public static void main(String[] args) {
    String s1, s2;
    Scanner in = new Scanner(System.in);

    System.out.print("\nEnter the first string = ");
    s1 = in.nextLine();
    System.out.print("Enter the second string = ");
    s2 = in.nextLine();

    if (s1.compareTo(s2) > 0) {
      System.out.println("\nFirst string is greater than second...\n");
    } else if (s1.compareTo(s2) < 0) {
      System.out.println("\nFirst string is smaller than second...\n");
    } else {
      System.out.println("\nBoth strings are equal!!!\n");
    }
    in.close();
  }
}
