
public class HourlyEmployee extends Employee
{
private String name;
private Date birthday;
private double wagePerHour;
private double hoursWorkedPerWeek;
   public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek)
   {
      super(name, birthday);
      this.wagePerHour = wagePerHour;
      this.hoursWorkedPerWeek = hoursWorkedPerWeek;
   }

   public double getWagePerHour()
   {
      return wagePerHour;
   }

   public void setWagePerHour(double wagePerHour)
   {
      this.wagePerHour = wagePerHour;
   }

   public double getHoursWorkedPerWeek()
   {
      return hoursWorkedPerWeek;
   }

   public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
   {
      this.hoursWorkedPerWeek = hoursWorkedPerWeek;
   }

   public double earningsPerWeek() {
      return this.hoursWorkedPerWeek*this.wagePerHour;
   }

   public String toString()
   {
      return "HourlyEmployee [name=" + name + ", birthday=" + birthday
            + ", wagePerHour=" + wagePerHour + ", hoursWorkedPerWeek="
            + hoursWorkedPerWeek + "]";
   }

   public boolean equals(Object obj) {
      if(!(obj instanceof HourlyEmployee))
      {
         return false;
      }
      HourlyEmployee copy = (HourlyEmployee) obj;
      if(copy.getBirthday().equals(birthday) && copy.getName().equals(name) && copy.getHoursWorkedPerWeek() == this.hoursWorkedPerWeek && copy.getWagePerHour() == this.wagePerHour)
         return true;
      return false;
   }


}
