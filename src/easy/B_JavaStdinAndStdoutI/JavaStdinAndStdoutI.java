package easy.B_JavaStdinAndStdoutI;

import java.util.Scanner;

public class JavaStdinAndStdoutI {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Input number: ");

    while (scan.hasNext()) {
      int num = scan.nextInt();
      System.out.println(num);
    }
    scan.close();
  }
}
