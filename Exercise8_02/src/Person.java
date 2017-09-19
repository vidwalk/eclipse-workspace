import java.util.Scanner;
public class Person
{
   String name;
   String birthday;
   Scanner scan = new Scanner(System.in);
   public Person()
   {  
      System.out.println("Write your name");
      name = scan.nextLine();
      System.out.println("Write your birthday");
      birthday = scan.nextLine();
   }
   
   public String getName()
   {
      return name;
   }
   public String getBirthday()
   {
      return birthday;
   }
   public void changeName()
   {
      System.out.println("What is your name again?");
      name = scan.nextLine();
   }
   public void changeBirthday()
   {
      System.out.println("What is your birthday again?");
      birthday = scan.nextLine();
   }
   public boolean YesorNo(String c)
   {
      if( c == "y")
         return false;
      return true;
   }
}
