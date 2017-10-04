
public class Line
{
   String colour;
   Point pointA;
   Point pointB;

   public Line(Point pointA, Point pointB, String colour)
   {
      this.pointA = pointA;
      this.pointB = pointB;
      this.colour = colour;
   }

   public Line(Point pointA, Point pointB)
   {
      this.pointA = pointA;
      this.pointB = pointB;
      this.colour = "black";
   }

   public void setColor(String colour)
   {
      this.colour = colour;
   }

   public String getColor()
   {
      return this.colour;
   }

   public void setPointA(Point point)
   {
      this.pointA = point;
   }

   public void setPointB(Point point)
   {
      this.pointB = point;
   }

   public Point getPointA()
   {
      return this.pointA;
   }

   public Point getPointB()
   {
      return this.pointB;
   }

   public double getLength()
   {
      return Math.sqrt(Math.pow(pointB.x - pointA.x, 2)
            + Math.pow(pointB.y - pointA.y, 2));
   }

   public String toString()
   {
      String result = "";
      result = result + this.colour;
      result = result + "(" + this.pointA.x + ", " + this.pointA.y + ")" + " ("
            + this.pointB.x + ", " + this.pointB.y + ")";
      return result;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Line))
      {
         return false;
      }
      Line object = (Line) obj;
      if (this.colour.equals(object.colour)
            && this.pointA.equals(object.getPointA())
            && this.pointB.equals(object.getPointB()))
         return true;
      return false;
   }

   public double getSlope()
   {
      double result = ((double)this.pointB.y - (double)this.pointA.y)
            / ((double)this.pointB.x - (double)this.pointA.x);
      return result;
   }

   public double getYIntercept()
   {
      double result = (this.pointA.y - this.pointA.x * getSlope());
      return result;
   }

   public String getSlopeIntercept()
   {
      String result = "";
      result = result + "y=";
      result = result + " " + getSlope() + "x" + " + " + getYIntercept();
      return result;
   }

   public boolean equalSlopeIntercept(Line line)
   {
      String comparison = getSlopeIntercept();
      if (comparison.equals(line.getSlopeIntercept()))
         return true;
      return false;
   }
}
