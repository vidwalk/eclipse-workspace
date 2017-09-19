
public class RectangleTest
{

   public static void main(String[] args)
   {
      Rectangle rectangle = new Rectangle(20, 10);
      System.out.println("The length is: " + rectangle.getLength());
      System.out.println("The width is: " + rectangle.getWidth());
      System.out.println("The Area is: " + rectangle.getArea());
      System.out.println("New values are entered");
      rectangle.setLength(40);
      rectangle.setWidth(30);
      
      System.out.println("The length is: " + rectangle.getLength());
      System.out.println("The width is: " + rectangle.getWidth());
      System.out.println("The Area is: " + rectangle.getArea());
   }

}
