import java.util.ArrayList;

public class ServiceBook
{
   public ArrayList<Service> services;

   public ServiceBook()
   {
      services = new ArrayList<Service>();
   }

   public void addService(Service service)
   {
      this.services.add(service);
   }

   public int getNumberOfServices()
   {
      return this.services.size();
   }

   public Service getService(int index)
   {
      return this.services.get(index);
   }

   public Service[] getAllServices()
   {
      return services.toArray(new Service[services.size()]);
   }

   public int[] getAllServiceMilages()
   {
      int[] index = new int[services.size()];
      for (int i = 0; i < services.size(); i++)
      {
         index[i] = services.get(i).mileage;
      }
      return index;
   }

   public boolean hasServiceOnDate(Date date)
   {
      for (int i = 0; i < services.size(); i++)
      {
         if (services.get(i).date.equals(date))
            return true;
      }
      return false;
   }

   public Date getDateOfLastService()
   {
      return services.get(services.size() - 1).date;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof ServiceBook))
      {
         return false;
      }
      ServiceBook object = (ServiceBook) obj;
      if (services.size() != object.services.size())
         return false;
      else
      {
         for (int i = 0; i < services.size(); i++)
         {
            if (services.get(i).mileage != object.services.get(i).mileage
                  || services.get(i).date.equals(object.services.get(i).date))
            {
               return false;
            }
         }
      }
      return true;
   }

   public String toString()
   {
      String result = "";
      for (int i = 0; i < services.size(); i++)
      {
         result = result + services.get(i).toString();
         if (i < services.size() - 1)
         {
            result = result + "\n";
         }
      }
      return result;
   }
}
