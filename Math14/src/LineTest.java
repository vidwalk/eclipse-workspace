import java.util.Scanner;
public class LineTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What are the points of the line?");
      System.out.println("The first point(x,y): ");
      int x = scan.nextInt();
      int y = scan.nextInt();
      Point pointA = new Point(x,y);
      System.out.println("The second point(x,y): ");
      x = scan.nextInt();
      y = scan.nextInt();
      Point pointB = new Point(x,y);
      System.out.println("2 identical lines are created");
      Line line = new Line(pointA, pointB);
      Line lineCopy = new Line(pointA, pointB);
      System.out.println("The slope is= " + line.getSlope());
      System.out.println("The y-incercept is= " + line.getYIntercept());
      System.out.println("Are they equal? " + line.equals(lineCopy));
      System.out.println("Are the slope equal? " + line.equalSlopeIntercept(lineCopy));
      System.out.println("The slope-intercept form of the first line is: " + line.getSlopeIntercept());
      scan.close();
   }

}
