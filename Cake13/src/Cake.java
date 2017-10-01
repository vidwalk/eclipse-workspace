
public class Cake
{
   String name;
   double weight;
   double amountLeft;
   public Cake(String name, double weight)
   {
      this.name = name;
      this.weight = weight;
      amountLeft = 100;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public double getWeight()
   {
      return this.weight;
   }
   
   public double getAmountLeft()
   {
      return this.amountLeft;
   }
   
   public void eatPercentageAmount(double percentage)
   {
      this.amountLeft = this.amountLeft - percentage;
      this.weight = this.weight - (double)((this.weight*percentage)/100);
   }
   
   public void eatAmount(double weight)
   {
      amountLeft = amountLeft - (weight/this.weight)*100;
      this.weight = this.weight - weight;      
   }
   
   public boolean isCakeGone()
   {
      if(weight <= 0)
      {
         return true;
      }
      return false;
   }
   
   public boolean equals(Object other)
   {
      if(other instanceof Cake)
      {
         return false;
      }
      else
      {
         Cake object = (Cake) other;
         if(this.name.equals(object.getName()) && this.weight == object.getWeight())
            return true;
      }
      return false;
   }
   
   public void eat(double amount, char unit)
   {
      if(unit == 'g')
      {
         amountLeft = amountLeft - (amount/this.weight)*100;
         this.weight = this.weight - amount;
      }
      else if(unit == '%')
      {
         this.amountLeft = this.amountLeft - amount;
         this.weight = this.weight - (double)((this.weight*amount)/100);
      }
   }
   public static Cake makeRumBall(Cake first, Cake second)
   {
      Cake rumBall = new Cake("Rum Ball", first.weight+second.weight);
      return rumBall;
   }
}
