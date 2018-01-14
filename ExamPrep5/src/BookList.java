import java.util.ArrayList;

public class BookList
{
   private ArrayList<Book> books;

   public BookList()
   {
      books = new ArrayList<Book>();
   }

   public int getNumberOfBooks()
   {
      return books.size();
   }

   public void addBook(Book book)
   {
      books.add(book);
   }

   public Book getBook(int index)
   {
      return books.get(index);
   }

   public Book getBook(String isbn)
   {
      for (int i = 0; i < books.size(); i++)
         if (books.get(i).getIsbn().equals(isbn))
            return books.get(i);
      return null;
   }

   public void removeBook(int index)
   {
      books.remove(index);
   }

   public int getIndexOfFirstPrintedBook()
   {
      for (int i = 0; i < books.size(); i++)
         if (books.get(i) instanceof PrintedBook)
            return i;
      return -1;
   }

   public int getNumberOfBooksByType(String bookType)
   {
      int counter = 0;
      for (int i = 0; i < books.size(); i++)
         if (books.get(i).getBookType().equals(bookType))
            counter++;
      return counter;
   }

   public Book[] getBooksByType(String bookType)
   {
      Book[] result = new Book[books.size()];
      int j = 0;
      for (int i = 0; i < books.size(); i++)
         if (books.get(i).getBookType().equals(bookType))
         {
            result[j] = books.get(i);
            j++;
         }
      return result;
   }

   public Ebook[] getAllEBooks()
   {
      Ebook[] result = new Ebook[books.size()];
      int j = 0;
      for (int i = 0; i < books.size(); i++)
         if (books.get(i) instanceof Ebook)
         {
            result[j] = (Ebook) books.get(i);
            j++;
         }
      return result;
   }

   public String toString()
   {
      String result = "";
      for (int i = 0; i < books.size(); i++)
      {
         result = result + books.get(i) + " ";
      }
      return result;
   }

   public boolean equals(Object obj)
   {
      if(!(obj instanceof BookList))
         return false;
      BookList bookList = (BookList) obj;
      if(bookList.books.size() == getNumberOfBooks())
      for (int i = 0; i < books.size(); i++)
         if(bookList.books.get(i).equals(books.get(i)))
            return true;
      return false;
   }
}
