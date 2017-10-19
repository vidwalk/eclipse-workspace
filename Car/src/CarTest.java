import java.util.Scanner;

public class CarTest
{

   public static void main(String[] args)
   {
      
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the car's registration number, mileage");
      String registrationNumber = scan.nextLine();
      int mileage = scan.nextInt();
      Car car = new Car(registrationNumber, mileage);
      System.out.println("Go to service");
      car.service();
      System.out.println("The data of the car after service: " + "\n" +car.toString());
      car.service();
      car.serviceBook.services.set(0, new Service(car.serviceBook.services.get(0).mileage, new Date(10, 8, 2014)));
      System.out.println("The data of the car after service: " + "\n" +car.toString());
      car.drive(7200);
      car.setRegistrationNumber("ClearCodeClearLife");
      car.service();
      System.out.println("The data of the car after service: " + "\n" +car.toString());
      scan.close();
   }

}
