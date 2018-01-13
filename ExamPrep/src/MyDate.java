
public class MyDate
{
public int day;
public int month;
public int year;
public MyDate(int day, int month, int year){
   this.day = day;
   this.month = month;
   this.year = year;
}
public MyDate copy() {
   MyDate copy = new MyDate(this.day, this.month, this.year);
   return copy;
}
public String toString() {
   String result = "";
   return result + this.day +"/" +this.month +"/"+this.year;
}
}
