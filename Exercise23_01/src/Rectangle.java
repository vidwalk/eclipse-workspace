
public class Rectangle extends TwoDimensionalShape
{
   double width;
   double height;

   Rectangle(double x, double y, double width, double height)
   {
      super(x, y);
      this.width = width;
      this.height = height;
   }

   public double getWidth()
   {
      return this.width;
   }

   public double getHeight()
   {
      return this.height;
   }

   public void setSides(double width, double height)
   {
      this.width = width;
      this.height = height;
   }

   public double getArea()
   {
      return width * height;
   }

}
