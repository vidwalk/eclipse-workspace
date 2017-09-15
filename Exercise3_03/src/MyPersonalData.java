import java.util.Scanner;

public class MyPersonalData
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      int age;
      String name , address;
      age = scanner.nextInt(); // The age is AGE[Enter]
      scanner.nextLine(); // This is so we can absorb the [Enter] and avoid printing a blank
      name = scanner.nextLine(); // This is so we can read the string 
      // scanner.nextLine();  after a string we don't need to absorb the [Enter]
      address = scanner.nextLine(); // This is so we can read the string
      System.out.println("My name is " + name);
      System.out.println("My age is " + age);
      System.out.println("My address is " + address);
   }
}
