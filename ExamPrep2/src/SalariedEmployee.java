
public class SalariedEmployee extends Employee
{
private String name;
private Date birthday;
private double weeklySalary;
   public SalariedEmployee(String name, Date birthday, double weeklySalary)
   {
      super(name, birthday);
      this.weeklySalary = weeklySalary;
   }


   public double getWeeklySalary()
   {
      return weeklySalary;
   }


   public void setWeeklySalary(double weeklySalary)
   {
      this.weeklySalary = weeklySalary;
   }


   public double earningsPerWeek()
   {
      return 4*weeklySalary;
   }

   public String toString()
   {
      return "SalariedEmployee [name=" + name + ", birthday=" + birthday
            + ", weeklySalary=" + weeklySalary + "]";
   }

   public boolean equals(Object obj)
   {
      if(!(obj instanceof SalariedEmployee))
         return false;
      SalariedEmployee copy = (SalariedEmployee) obj;
      if(copy.getBirthday().equals(birthday) && copy.getName().equals(name) && copy.getWeeklySalary() == this.weeklySalary)
         return true;
      return false;
   }
}
