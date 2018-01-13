
public class PriorityNote extends Note
{
String message;
int priority;
public PriorityNote(String message, int priority) {
   super(message);
   this.priority = priority;
}
public int getPriority() {
   return this.priority;
}
   public Note copy()
   {
      Note copy = new PriorityNote(this.message, this.priority);
      return copy;
   }
public String toString() {
   String result = "";
   return result + this.message + " " + this.priority;
}
}
