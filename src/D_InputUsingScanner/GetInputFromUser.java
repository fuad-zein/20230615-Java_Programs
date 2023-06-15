package D_InputUsingScanner;

import java.util.Scanner;

public class GetInputFromUser {

  public static void main(String[] args) {
    int a;
    float b;
    String s;

    Scanner in = new Scanner(System.in);

    System.out.print("Enter a string = ");
    s = in.nextLine();
    System.out.println("You entered string " + s);
    System.out.println();

    System.out.print("Enter an integer = ");
    a = in.nextInt();
    System.out.println("You entered integer " + a);
    System.out.println();

    System.out.print("Enter a float = ");
    b = in.nextFloat();
    System.out.println("You entered float " + b);

    in.close();
  }
}
