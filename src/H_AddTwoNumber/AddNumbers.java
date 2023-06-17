package H_AddTwoNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNumbers {

  public static void main(String[] args) {
    int x, y, z;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter two integers to calculate their sum...");
    System.out.print("x = ");
    x = in.nextInt();
    System.out.print("y = ");
    y = in.nextInt();

    z = x + y;
    System.out.println();
    System.out.println("Sum of entered integers = " + z);

    in.close();
  }
}

/*
 * For Large Number
 */
class AddingLargeNumbers {

  public static void main(String[] args) {
    String number1, number2;
    Scanner in = new Scanner(System.in);

    System.out.print("Enter first large number = ");
    number1 = in.nextLine();
    System.out.print("Enter second large number = ");
    number2 = in.nextLine();

    BigInteger first = new BigInteger(number1);
    BigInteger second = new BigInteger(number2);
    BigInteger sum;

    sum = first.add(second);

    System.out.println();
    System.out.println("Result of addition = " + sum);
    System.out.println();

    in.close();
  }
}
