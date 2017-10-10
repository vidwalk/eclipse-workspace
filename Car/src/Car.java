
public class Car
{
String registrationNumber;
int mileage;
ServiceBook serviceBook;

public Car(String registrationNumber, int mileage)
{
   this.registrationNumber = registrationNumber;
   this.mileage = mileage;
   this.serviceBook = new ServiceBook();
}

public String getRegistrationNumber()
{
   return this.registrationNumber;
}

public int getMileage()
{
   return this.mileage;
}

public ServiceBook getServiceBook()
{
   return this.serviceBook;
}

public void setRegistrationNumber(String registrationNumber)
{
   this.registrationNumber = registrationNumber;
}

public void drive(int mileage)
{
   this.mileage = this.mileage + mileage;
}

public void service()
{
   this.serviceBook.addService(new Service(mileage, new Date()));
}

public String toString()
{
   String result ="";
   result = result+ this.registrationNumber;
   result = result + " " + this.mileage;
   result = result + " " + this.serviceBook.toString();
   return result;
}
}
