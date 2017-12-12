
public class Person
{
String name;
Home home;
Person(String name, Home home)
{
   this.name = name;
   this.home = home;
}
public String getHomeInfo()
{
   return home.getInfo();
}
public String toString()
{
   return "The name is: " + this.name + " " + home.toString();
}
}
