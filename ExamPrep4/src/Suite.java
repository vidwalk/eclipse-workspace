
public class Suite extends Room
{
private int noOfRooms;
   public Suite(int number, String bedType, int noOfRooms)
   {
      super(number, "King size");
      this.noOfRooms = noOfRooms;
   }
public double getPrice() {
   if(noOfRooms == 2)
      return 120.00;
   if(noOfRooms == 3)
      return 160.00;
   if(noOfRooms >= 4)
      return 160 + 30*(noOfRooms-3);
   return 0;
}
public int getNumberOfRooms() {
   return noOfRooms;
}
}
