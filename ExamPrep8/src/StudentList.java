
public class StudentList
{
   private int size;
   private Student[] list;

   public StudentList(int size)
   {
      list = new Student[size];
   }

   public void addStudent(Student student)
   {
      boolean ok = false;
      for(int i = 0 ; i < list.length && ok == false ; i++)
         if(list[i] == null)
         {
            list[i] = student;
            ok = true;
         }
   }

   public Student getStudent(int index)
   {
      return list[index];
   }

   public Student removeStudent(Student student)
   {

      boolean ok = false;
      for(int i = 0 ; i < list.length && ok == false ; i++)
         if(list[i].equals(student))
         {
            list[i] = null;
            ok = true;
         }
      return null;
   }

   public int getNumberOfStudents()
   {
      return list.length;
   }

   public int getNumberOfStudentsByEducation(Education education)
   {
      int counter = 0;
      for(int i = 0 ; i < list.length; i++)
      {
         if(list[i].getEducation().equals(education))
            counter++;
      }
      return counter;
   }

   public Student[] getStudentByEducation(Education education)
   {
      int j = 0;
      Student[] result = new Student[list.length];
      for(int i = 0 ; i < list.length; i++)
      {
         if(list[i].getEducation().equals(education))
            {
            result[j] = list[i];
            j++;
            }
      }
      return result;
   }

   public int getNumberOfHighSchoolStudents()
   {
      int counter = 0;
      for(int i = 0 ; i < list.length; i++)
      {
         if(((School)list[i].getEducation()).getSchoolType().equals("High school"))
            counter++;
      }
      return counter;
   }

   public void doubleTheListCapacity()
   {
      Student[] copy = new Student[list.length];
      for(int i = 0 ; i < list.length; i++)
      {
         copy[i] = list[i];
      }
      list = copy;
   }
}
