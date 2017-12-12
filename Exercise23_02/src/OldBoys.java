
public class OldBoys extends ClubMember
{
   int yearsOfMembership;

   OldBoys(String name, int age, int yearsOfMembership)
   {
      super(name, age);
      this.yearsOfMembership = yearsOfMembership;
   }

   public int getYearsOfMembership()
   {
      return this.yearsOfMembership;
   }

   public void setYearsOfMembership(int yearOfMembership)
   {
      this.yearsOfMembership = yearOfMembership;
   }

   public String toString()
   {
      return super.toString() + " this are the years of membership: "
            + this.yearsOfMembership;
   }

   public double getMembershipFee()
   {
      return 50 - (20 * this.yearsOfMembership) / 100;
   }

}
