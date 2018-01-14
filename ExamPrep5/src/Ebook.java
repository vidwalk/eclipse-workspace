
public class Ebook extends Book
{
private String url;
   public Ebook(String title, String isbn, String url)
   {
      super(title, isbn);
      this.url = url;
   }

   public String getUrl() {
      return url;
   }
   public String getBookType()
   {
      return "Ebook";
   }
   public String toString() {
      return "" + url;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Ebook))
         return false;
      Ebook copy = (Ebook) obj;
      if (copy.getUrl().equals(url))
         return true;
      return false;
   }
}
