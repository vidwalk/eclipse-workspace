import java.util.ArrayList;

public class GradeListArray
{

      private ArrayList<Grade> grades;

      public GradeListArray(int numberOfGrades)
      {
         grades = new ArrayList<Grade>();
      }

      public int getNumberOfGrades()
      {
         return grades.size();
      }

      public ArrayList<Grade> getAllGrades(int index)
      {
         return grades;
      }

      public double getAverage()
      {
         double average = 0;
         double sum = 0;
         for (int i = 0; i < grades.size(); i++)
         {
            sum = sum + grades.get(i).grade;
         }
         average = sum / (double) grades.size();
         return average;
      }

      public String toString()
      {
         String result = "";
         for (int i = 0; i < grades.size(); i++)
         {
            result = result + grades.get(i).courseName + " "
                  + grades.get(i).grade;
            if (i < grades.size() - 1)
               result = result + "\n";
         }
         return result;
      }
      
}
