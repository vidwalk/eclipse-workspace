import java.util.Scanner;
public class PersonTest
{

   public static void main(String[] args)
   {  
      Scanner scan = new Scanner(System.in);
      Person person = new Person();
      System.out.println("Your name is " + person.getName());
      System.out.println("Your birthday is " + person.getBirthday());
      System.out.println("Is your name and birthday correctly written?(Y for yes, N for no) ");
      String c = scan.nextLine();
      c.toLowerCase();
      if(person.YesorNo(c))
      {
         person.changeName();
         person.changeBirthday();
      }
      System.out.println("Your name is " + person.getName());
      System.out.println("Your birthday is " + person.getBirthday());
      scan.close();
   }

}
