
public class Student
{
   char gender;
   String name;
   int studyNumber;

   public Student(char g, String n, int sN)
   {
      gender = g;
      name = n;
      studyNumber = sN;
   }

   public void setName(String n)
   {
      name = n;
   }

   public void setStudyNumber(int sN)
   {
      studyNumber = sN;
   }

   public String getName()
   {
      return name;
   }

   public char getGender()
   {
      return gender;
   }

   public int getStudyNumber()
   {
      return studyNumber;
   }

   public void toSstring()
   {
      System.out.println(name + ", " + "'" + gender + "'," + studyNumber);
   }
}
