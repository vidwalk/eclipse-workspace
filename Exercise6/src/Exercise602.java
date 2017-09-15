import java.util.Scanner;
import java.util.ArrayList;

public class Exercise602
{
   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<String>();
      String[] wordsArray = new String[100];
      Scanner scan = new Scanner(System.in);
      String word;
      int counter = 0;
      System.out.println("Enter a string: ");
      word = scan.nextLine();
      words.add(word);
      while(!(word.equals("")))
      {
         System.out.println("Enter another string until you want to stop: ");
         word = scan.nextLine();
         words.add(word);
      }
      for(String letter: words)
      {
         wordsArray[counter] = letter;
         counter++;
      }
      for(int i = 0; i < counter ; i++)
      {
         System.out.print(wordsArray[i] + " ");
      }
      scan.close();
   }
}
