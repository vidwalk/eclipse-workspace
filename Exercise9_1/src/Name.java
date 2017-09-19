
public class Name
{  String[] nameParts;
   String person;
   public Name(String name)
   {  
      person = name;
      nameParts = name.split(" ");
   }
      public String getFullName()
      {  
         return nameParts[0] + " " + nameParts[1];
      }
      public String getFormalName()
      {
         return nameParts[1] + ", " + nameParts[0];
      }
      public String getFirstName()
      {
         return nameParts[0];
      }
      public String getLastName()
      {
         return nameParts[1];
      }
      public String toString()
      {
         return person;
      }
}
