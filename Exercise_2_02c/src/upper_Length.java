// This program demonstrates the String class's length method and printing the name in capital with .toUpperCase()

public class upper_Length
{
   public static void main(String[] args)
   {
      String name = "Herman";
      int stringSize;

      stringSize = name.length();
      System.out.println(name.toUpperCase() + " has " + stringSize + " characters.");
   }
}
