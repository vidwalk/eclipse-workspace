import java.util.ArrayList;
import java.util.Scanner;

public class Notebook
{
   int numberOfNotes;
   private Note[] notes;

   public Notebook(int maxNumberOfNotes)
   {
      numberOfNotes = maxNumberOfNotes;
      notes = new Note[numberOfNotes];
   }

   public void addNote(Note note)
   {
      boolean ok = false;
      for (int i = 0; i < this.numberOfNotes && ok == false; i++)
      {
         if (notes[i] == null)
         {
            notes[i] = note.copy();
            ok = true;
         }
      }
   }

   public void setNote(Note note, int index)
   {
      notes[index] = note.copy();
   }

   public void remove(int index)
   {
      notes[index] = null;
   }

   public Note getNote(int index)
   {
      return notes[index];
   }

   public int getNumberOfPriorityNotes()
   {
      int counter = 0;
      for (int i = 0; i < this.numberOfNotes; i++)
      {
         if (notes[i] != null)
            if (notes[i].copy() instanceof PriorityNote)
               counter++;
      }
      return counter;
   }

   public PriorityNote[] getPriorityNotes()
   {
      int counter = 1;
      PriorityNote[] result = new PriorityNote[getNumberOfPriorityNotes()];
      int index = 0;
      while (counter <= 3)
      {
         for (int i = 0; i < this.numberOfNotes; i++)
         {
            if (notes[i].copy() instanceof PriorityNote)
            {
               PriorityNote copy = (PriorityNote) notes[i].copy();
               if(copy.getPriority() == counter)
                  {result[index] = copy;
                        index++;
                  }
            }
         }
      }
      return result;
   }

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int nr = scan.nextInt();
      Notebook notebook = new Notebook(nr);
      int priority = scan.nextInt();
      PriorityNote priorityNote = new PriorityNote("blabla", priority);
      priority = scan.nextInt();
      PriorityNote priorityNote2 = new PriorityNote("blabla", priority);
      MyDate date = new MyDate(24, 01, 1998);
      DatedNote datedNote = new DatedNote("blabla", date);
      notebook.addNote(priorityNote);
      notebook.addNote(datedNote);
      notebook.addNote(priorityNote2);
      System.out.println("result" + " " + notebook.getNumberOfPriorityNotes());
      scan.close();
   }
}
