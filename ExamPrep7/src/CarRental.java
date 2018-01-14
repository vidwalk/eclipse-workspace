import java.util.ArrayList;

public class CarRental
{
private ArrayList<Car> carsForRent;
private String companyName;
private String address;
public CarRental(String companyName, String adress)
{
carsForRent = new ArrayList<Car>();
this.companyName = companyName;
this.address = adress;
}

public String getCompanyName()
{
   return companyName;
}
public String getAddress()
{
   return address;
}

public int getNumberOfCars()
{
   return carsForRent.size();
}

public Car getCar(int index)
{
   return carsForRent.get(index);
}

public Car getCarByLicense(String licenseNo)
{
   for(int i = 0 ; i< carsForRent.size(); i++)
   {
      if(carsForRent.get(i).getLicenseNo().equals(licenseNo))
         return carsForRent.get(i);
   }
   return null;
}

public SportsCar getAvailableSportsCar()
{
   for(int i = 0 ; i< carsForRent.size(); i++)
   {
      if(carsForRent.get(i) instanceof SportsCar)
         return (SportsCar) carsForRent.get(i);
   }
   return null;
}

public Van getAvailableVan(int minCapacity)
{
   for(int i = 0 ; i< carsForRent.size(); i++)
   {
      if(carsForRent.get(i) instanceof Van && ((Van) carsForRent.get(i)).getCapacity() >= minCapacity)
         return (Van) carsForRent.get(i);
   }
   return null;
}
}
