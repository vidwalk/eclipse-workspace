import java.util.Scanner;
public class JavaTeacher extends Teacher
{
String majorCourse = "Java";
JavaTeacher(String majorCourse, String title)
{
   super(title);
   this.majorCourse = majorCourse;
}
public void teach()
{
   System.out.println("You just wasted your life in school. PRANKED!");
}
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   String Course = scan.nextLine();
   String title = scan.nextLine();
   JavaTeacher jtObject = new JavaTeacher(Course, title);
   System.out.println("Title: " + jtObject.title);
   System.out.println("Dept: " + jtObject.dept);
   System.out.println("Course: " + jtObject.majorCourse);
   jtObject.teach();
}
}
