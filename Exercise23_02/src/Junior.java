
public class Junior extends ClubMember
{
   char gender;

   Junior(String name, int age, char gender)
   {
      super(name, age);
      this.gender = gender;
   }

   public char getGender()
   {
      return this.gender;
   }

   public String toString()
   {
      return super.toString() + " this is the gender: " + this.gender;
   }

   public double getMembershipFee()
   {
      return 40;
   }

}
