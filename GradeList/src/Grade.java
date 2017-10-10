
public class Grade
{
   String courseName;
   int grade;

   public Grade(String courseName, int grade)
   {
      this.courseName = courseName;
   }

   public String getCourseName()
   {
      return this.courseName;
   }

   public int getGrade()
   {
      return this.grade;
   }

   public void setCourseName(String courseName)
   {
      this.courseName = courseName;
   }

   public void setGrade(int grade)
   {
      this.grade = grade;
   }

   public String toString()
   {
      String result = "";
      result = result + this.courseName;
      result = result + " " + this.grade;
      return result;
   }
}
