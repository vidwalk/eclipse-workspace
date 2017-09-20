import java.util.Scanner;

public class StudentTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String name, auxiliarGender;
      char gender;
      int studentNumber;
      System.out.println("Input the data for the student");
      System.out.println("Gender:");
      auxiliarGender = scan.nextLine();
      auxiliarGender.toUpperCase();
      gender = auxiliarGender.charAt(0);
      System.out.println("Name:");
      name = scan.nextLine();
      System.out.println("Student Number:");
      studentNumber = scan.nextInt();
      scan.nextLine();
      Student student1 = new Student(gender, name, studentNumber);
      
      System.out.println("Input the data for the student");
      System.out.println("Gender:");
      auxiliarGender = scan.nextLine();
      auxiliarGender.toUpperCase();
      gender = auxiliarGender.charAt(0);
      System.out.println("Name:");
      name = scan.nextLine();
      System.out.println("Student Number:");
      studentNumber = scan.nextInt();
      scan.nextLine();
      Student student2 = new Student(gender, name, studentNumber);
      
      System.out.println("Input the data for the student");
      System.out.println("Gender:");
      auxiliarGender = scan.nextLine();
      auxiliarGender.toUpperCase();
      gender = auxiliarGender.charAt(0);
      System.out.println("Name:");
      name = scan.nextLine();
      System.out.println("Student Number:");
      studentNumber = scan.nextInt();
      scan.nextLine();
      Student student3 = new Student(gender, name, studentNumber);
      
      System.out.println("Data for the first student: ");
      student1.toSstring();
      
      System.out.println("Changing the name for the second student:");
      name = scan.nextLine();
      student2.setName(name);
      student2.toSstring();
      
      System.out.println("Getting the Study Number for the third student");
      System.out.println(student3.getStudyNumber());
      student3.toSstring();
      
      scan.close();
   }
}
