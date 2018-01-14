
public class Student
{
   private String name;
   private Education education;

   Student(String name, Education education)
   {
      this.name = name;
      this.education = education;
   }

   public void changeducation(Education education)
   {
      this.education = education;
   }

   public String getName()
   {
      return name;
   }

   public Education getEducation()
   {
      return education;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Student))
         return false;
      Student copy = (Student) obj;
      if (copy.getEducation().equals(education) && copy.getName().equals(name))
         return true;
      return false;
   }

   public String toString()
   {
      return "" + name + " " + education;
   }
}
