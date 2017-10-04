
public class Point
{
   int x;
   int y;

public Point(int x, int y)
{
   this.x = x;
   this.y = y;
}

public int getX()
{
   return this.x;
}

public int getY()
{
   return this.y;
}

public void moveTo(int newX, int newY)
{
   this.x = newX;
   this.y = newY;
}

public void move(int xDistance, int yDistance)
{
   this.x = this.x + xDistance;
   this.y = this.y + yDistance;
}

public String toString()
{
 return "(" + x + ", " + y + ")";  
}

public boolean equals(Object obj)
{
   if (!(obj instanceof Point))
   {
      return false;
   }
   Point object = (Point) obj;
   if (this.x == object.getX() && this.y == object.getY())
      return true;
   return false;
}

public Point copy()
{
   Point copy = new Point(this.x, this.y);
   return copy;
}

}