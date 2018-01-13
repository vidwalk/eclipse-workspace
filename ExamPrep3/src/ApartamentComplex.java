import java.util.ArrayList;

public class ApartamentComplex
{
   private String adress;
   private ArrayList<Residence> residences = new ArrayList<Residence>();

   public ApartamentComplex(String adress)
   {
      this.adress = adress;
   }

   public int getNumberOfResidents()
   {
      return residences.size();
   }

   public void add(Residence residence)
   {
      residences.add(residence);
   }

   public Residence getResidence(int index)
   {
      return residences.get(index);
   }

   public Residence getResidenceByNumer(int number)
   {
      for (int i = 0; i < residences.size(); i++)
      {
         if (residences.get(i).getNumber() == number)
            return residences.get(i);
      }
      return null;
   }

   public Room getFirstAvailableRoom()
   {
      for (int i = 0; i < residences.size(); i++)
      {
         if(residences.get(i) instanceof Room && residences.get(i).isAvailable()) {
            return (Room) residences.get(i);
         }
      }
      return null;
   }

   public Apartament getFirstAvailableApartament() {
      for (int i = 0; i < residences.size(); i++)
      {
         if(residences.get(i) instanceof Apartament && residences.get(i).isAvailable()) {
            return (Apartament) residences.get(i);
         }
      }
      return null;
   }
}
