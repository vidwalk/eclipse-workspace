
public class DatedNote extends Note
{
private MyDate date;
private String message;
public DatedNote(String message, MyDate date)
{
   super(message);
   this.date = date.copy();
}
public MyDate getDate()
{
   return this.date;
}
public Note copy() {
   Note copy = new DatedNote(this.message, this.date);
   return copy;
}
public String toString() {
   String result = "";
   return result + this.message + " " + this.date;
}
}
