
public abstract class Education
{
   private String code;
   private String title;

   public Education(String code, String title)
   {
      this.code = code;
      this.title = title;
   }

   public String getCode()
   {
      return code;
   }

   public String getTitle()
   {
      return title;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Education))
         return false;
      Education copy = (Education) obj;
      if (copy.getCode().equals(code) && copy.getTitle().equals(title))
         return true;
      return false;
   }

   public String toString()
   {
      return "" + code + " " + title;
   }
}
