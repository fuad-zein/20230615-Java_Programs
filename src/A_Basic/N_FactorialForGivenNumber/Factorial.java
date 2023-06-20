package A_Basic.N_FactorialForGivenNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    int n, c, fact = 1;
    try (Scanner in = new Scanner(System.in)) {
      System.out.print("Enter a number to calculate = ");
      n = in.nextInt();

      if (n < 0) {
        System.out.println("Number should be non-negative...\n");
      } else {
        for (c = 1; c <= n; c++) {
          System.out.println("Factorial of " + n + " is = " + fact);
        }
      }
      in.close();
    }
  }
}

// calculate factorial for large number
class BigFactorial {

  public static void main(String[] args) {
    int n, c;
    try (Scanner in = new Scanner(System.in)) {
      BigInteger inc = new BigInteger("1");
      BigInteger fact = new BigInteger("1");

      System.out.print("\nInput an number = ");
      n = in.nextInt();

      for (c = 1; c <= n; c++) {
        fact = fact.multiply(inc);
        inc = inc.add(BigInteger.ONE);
      }
      System.out.println(n + "! = " + fact);
      in.close();
    }
  }
}
