
public class Tenant
{
private MyDate rentedFrom;
String name;
public Tenant(String name) {
this.name = name;
}
public String getName() {
   return name;
}
public MyDate getRentedFrom() {
   return rentedFrom;
}
public void setRentedFrom(MyDate date) {
   rentedFrom = date.copy();
}
}
