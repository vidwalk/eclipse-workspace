
public abstract class Book
{
   private String title;
   private String isbn;

   public Book(String title, String isbn)
   {
      this.title = title;
      this.isbn = isbn;
   }

   public String getTitle()
   {
      return title;
   }

   public String getIsbn()
   {
      return isbn;
   }

   public abstract String getBookType();

   public String toString()
   {
      return "" + title + " " + isbn;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Book))
         return false;
      Book copy = (Book) obj;
      if (copy.getTitle().equals(title) && copy.getIsbn().equals(isbn))
         return true;
      return false;
   }
}
