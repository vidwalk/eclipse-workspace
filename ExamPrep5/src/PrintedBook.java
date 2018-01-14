
public class PrintedBook extends Book
{
   private boolean isPaperBack;

   public PrintedBook(String title, String isbn, boolean isPaperBack)
   {
      super(title, isbn);
      this.isPaperBack = isPaperBack;
   }

   public String getBookType()
   {
      if (isPaperBack == true)
         return "Paperback";
      if (isPaperBack == false)
         return "Hard cover";
      return null;
   }

   public boolean isPaperBack()
   {
      return this.isPaperBack;
   }

   public String toString()
   {
      return "" + this.isPaperBack;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof PrintedBook))
         return false;
      PrintedBook copy = (PrintedBook) obj;
      if (copy.getBookType().equals(isPaperBack))
         return true;
      return false;
   }
}
