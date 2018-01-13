
public class Apartament extends Residence
{
   private int numberOfRooms;

   public Apartament(int number, double size, int numberOfRooms)
   {
      super(number, size, "Apartament");
      this.numberOfRooms = numberOfRooms;
   }

   public int getNumberOfRooms()
   {
      return numberOfRooms;
   }

}
