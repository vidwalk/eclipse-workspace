
public class School extends Education
{
private String type;
   public School(String code, String title, String type)
   {
      super(code, title);
      this.type = type;
   }

   public String getSchoolType()
   {
      return type;
   }

   public boolean equals(Object obj)
   {
      if(!(obj instanceof School))
         return false;
      School copy = (School) obj;
      if(copy.getSchoolType().equals(type) && copy.getTitle().equals(getTitle()) && copy.getCode().equals(getCode()))
         return true;
      return false;
   }

   public String toString()
   {
      return "" + getCode() + " " + getTitle() + " " + type;
   }
}
