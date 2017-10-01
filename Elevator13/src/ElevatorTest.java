import java.util.Scanner;

public class ElevatorTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please input the floor and capacity of the elevator: ");
      int floor = scan.nextInt();
      int capacity = scan.nextInt();
      while(floor < 0)
      {
         System.out.println("Input the floor again");
         floor = scan.nextInt();
      }
      
      while(capacity < 0)
      {
         System.out.println("Input the capacity again");
         capacity = scan.nextInt();
      }
      
      Elevator elevator = new Elevator(floor, capacity);
      System.out.println("A person enters");
      elevator.personEnter();
      System.out.println("A person with a certain weight baggage enters");
      int weight = scan.nextInt();
      elevator.personEnter(weight);
      System.out.println("Introduce a number to change the floor");
      int newFloor = scan.nextInt();
      if(elevator.moveToFloor(newFloor))
      System.out.println("You got to floor: " + newFloor);
      else
      System.out.println("The maximum capacity was surpassed(Please reduce weight)");
      elevator.personExit();
      if(elevator.moveToFloor(newFloor))
      System.out.println("You got to floor: " + newFloor);
      else
      System.out.println("The maximum capacity was surpassed(Please reduce weight)");
      scan.close();
   }

}
