
public class Room
{
   private Guest guest;
   private Bed bed;
   private int number;

   public Room(int number, String bedType)
   {
      this.bed = new Bed(bedType);
      this.number = number;
   }

   public int getNumber()
   {
      return number;
   }

   public int getFloor()
   {
      return number / 100;
   }

   public double getPrice()
   {
      if (bed.isSingle())
         return 59.70;
      if (bed.isDouble())
         return 72.40;
      if (bed.isKingSize())
         return 89.40;
      return 0;
   }

   public boolean isOccupied()
   {
      if (guest != null)
         return false;
      return true;
   }

   public void registerGuest(Guest guest)
   {
      this.guest = guest;
   }

   public void vacate()
   {
      guest = null;
   }

   public String getBedType()
   {
      if (bed.isSingle())
         return "Single";
      if (bed.isDouble())
         return "Double";
      if (bed.isKingSize())
         return "King size";
      return "none";
   }

   public Guest getGuest()
   {
      return guest;
   }
}
