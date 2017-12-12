import java.lang.IllegalArgumentException;
import java.util.Scanner;
public class Grade
{
   String courseName;
   int grade;
   Scanner scan = new Scanner(System.in);
   public Grade(String courseName, int grade)
   {
      this.courseName = courseName;
      this.grade = grade;
      while(isLegalGrade(this.grade)== false) {
      try {
        
            throw new IllegalArgumentException();
         }
         catch(IllegalArgumentException iae)
         { 
            System.out.println("Not a valid grade");
            this.grade = scan.nextInt();
            scan.nextLine();
           
         }
      }
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
      try {
      while(isLegalGrade(this.grade)== false)
         throw new IllegalArgumentException();
      }
      catch(IllegalArgumentException iae)
      {
         System.out.println("Not a valid grade");
         grade = scan.nextInt();
      
      }
      
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
   
   public static boolean isLegalGrade(int grade)
   {
      if(grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade ==10 || grade ==12)
         return true;
      return false;
   }
}
