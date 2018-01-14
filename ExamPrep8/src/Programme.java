
public class Programme extends Education
{
private String level;
   public Programme(String code, String title, String level)
   {
      super(code, title);
      this.level = level;
   }

   public String getLevel()
   {
      return level;
   }

   public boolean equals(Object obj)
   {
      if(!(obj instanceof Programme))
         return false;
      Programme copy = (Programme) obj;
      if(copy.getLevel().equals(level) && copy.getTitle().equals(getTitle()) && copy.getCode().equals(getCode()))
         return true;
      return false;
   }

   public String toString()
   {
      return "" + getCode() + " " + getTitle() + " " + level;
   }
}
