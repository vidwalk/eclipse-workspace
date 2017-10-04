
public class Circle
{
   double radius;
   Point centerPoint;

   public Circle(double radius, Point centerPoint)
   {
      this.radius = radius;
      this.centerPoint = centerPoint;
   }

   public double getRadius()
   {
      return this.radius;
   }

   public Point getCenterPoint()
   {
      return this.centerPoint;
   }

   public double getArea()
   {
      return Math.PI * (this.radius * this.radius);
   }

   public void moveTo(Point centerPoint)
   {
      this.centerPoint = centerPoint;
   }

   public String toString()
   {
      String result = "";
      result = result + "radius= " + this.radius;
      result = result + " CenterPoint= " + this.centerPoint.toString();
      return result;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Circle))
      {
         return false;
      }
      Circle object = (Circle) obj;
      if (this.centerPoint.equals(object.centerPoint)
            && this.radius == object.radius)
         return true;
      return false;
   }
}
