
public abstract class TwoDimensionalShape
{
   double x;
   double y;

   TwoDimensionalShape(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public double getX()
   {
      return this.x;
   }

   public double getY()
   {
      return this.y;
   }

   public void moveTo(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public abstract double getArea();
}
