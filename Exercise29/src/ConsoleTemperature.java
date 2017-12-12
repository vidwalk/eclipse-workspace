import java.util.Scanner;

public class ConsoleTemperature
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Type a temperature: ");
    double temperature = input.nextDouble();

    Temperature temp = new Temperature();
    double t = temp.fahrenheitToCelcius(temperature);
    System.out.println(temperature + " Celcius = " + t + " Fahrenheit");

    t = temp.celciusToFahrenheit(temperature); 
    System.out.println(temperature + " Fahrenheit = " + t + " Celcius");
  }
}
