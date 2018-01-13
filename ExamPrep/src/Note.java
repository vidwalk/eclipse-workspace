
public abstract class Note
{
private String message;
public Note(String message) {
   this.message = message;
}
public String getMessage(){
   return this.message;
}
abstract Note copy();

public String toString() {
   String result = "";
   return result + this.message;
}
}
