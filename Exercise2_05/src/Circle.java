
public class Circle
{
   public static void main(String[] args)
   {
      double radius = 22.5; // Radius of the circle
      double circumferince, area; // The Area and the Circumferince of the circle
      circumferince = 2 * radius * Math.PI; // The circumferince is 2rpi
      area = Math.pow(radius, radius) * Math.PI; // The circumferince is pir^2
      System.out.println("The circumferince is " + circumferince);
      System.out.println("The area is " + area);
   }
}
