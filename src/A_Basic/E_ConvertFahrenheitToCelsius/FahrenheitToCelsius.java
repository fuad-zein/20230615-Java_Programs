package A_Basic.E_ConvertFahrenheitToCelsius;

import java.util.Scanner;

public class FahrenheitToCelsius {

  public static void main(String[] args) {
    float temperature;
    Scanner in = new Scanner(System.in);

    System.out.print("Enter temperature in Fahrenheit = ");
    temperature = in.nextInt();

    temperature = ((temperature - 32) * 5) / 9;
    System.out.println(
      "Temperature in Celsius = " + temperature + " \u00B0C\r\n"
    );

    in.close();
  }
}
