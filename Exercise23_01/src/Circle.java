
public class Circle extends TwoDimensionalShape
{
   double radius;

   Circle(double x, double y, double radius)
   {
      super(x, y);
      this.radius = radius;
   }

   public double getRadius()
   {
      return this.radius;
   }

   public void setRadius(double radius)
   {
      this.radius = radius;
   }

   public double getArea()
   {
      return Math.PI * radius * radius;
   }
}
