
public abstract class ClubMember
{
   String name;
   int age;

   ClubMember(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

   public String getName()
   {
      return this.name;
   }

   public int getAge()
   {
      return this.age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public String toString()
   {
      return "this is the name: " + this.name + " this is the age: " + this.age;
   }

   public abstract double getMembershipFee();
}
