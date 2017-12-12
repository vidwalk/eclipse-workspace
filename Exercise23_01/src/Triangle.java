
public class Triangle extends TwoDimensionalShape
{
   double sideA;
   double sideB;
   double sideC;

   Triangle(double x, double y, double sideA, double sideB, double sideC)
   {
      super(x, y);
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
   }

   public double sideA()
   {
      return this.sideA;
   }

   public double sideB()
   {
      return this.sideB;
   }

   public double sideC()
   {
      return this.sideC;
   }

   public void setSide(double sideA, double sideB, double sideC)
   {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
   }

   public double getArea()
   {
      double angleC = Math.acos((sideA * sideA + sideB * sideB - sideC * sideC)
            / (2 * sideA * sideB));
      return 0.5 * sideA * sideB * Math.sin(angleC);
   }

}
