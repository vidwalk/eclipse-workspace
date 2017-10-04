
public class Person
{
   String name;
   MyDate birthday;
   
   public Person(String name, MyDate birthday){
      this.name = name;
      this.birthday = birthday.copy();
   }
   
   public Person(MyDate birthday) {
      this.birthday = birthday.copy();
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public String getName() {
      return this.name;
   }
   
   public MyDate getBirthday() {
      return this.birthday;
   }
   
   public int getAge()
   {
      MyDate object = MyDate.now();
      return birthday.yearsBetween(object);
   }
   
   public String toString() {
      String result ="";
      result = result + this.name;
      result = result + " " + this.birthday.toString();
      return result;
   }
   
   public boolean equals(Object object) {
      if (!(object instanceof Person))
      {
         return false;
      }
      Person obj = (Person) object;
      if(this.name.equals(obj.name) && this.birthday.equals(obj.birthday))
         return true;
      return false;
   }
}
