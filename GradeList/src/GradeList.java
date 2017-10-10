
public class GradeList
{
   private Grade[] grades;

   public GradeList(int numberOfGrades)
   {
      grades = new Grade[numberOfGrades];
   }

   public int getNumberOfGrades()
   {
      return grades.length;
   }

   public Grade getGrade(int index)
   {
      return grades[index];
   }

   public double getAverage()
   {
      double average = 0;
      double sum = 0;
      for (int i = 0; i < grades.length; i++)
      {
         sum = sum + grades[i].grade;
      }
      average = sum / (double) grades.length;
      return average;
   }

   public String toString()
   {
      String result = "";
      for (int i = 0; i < grades.length; i++)
      {
         result = result + grades[i].courseName + " " + grades[i].grade;
         if (i < grades.length - 1)
            result = result + "\n";
      }
      return result;
   }
}
