
public class Hotel
{
   private String name;
   private Room[] rooms;

   public Hotel(String name, Room[] rooms)
   {
      this.name = name;
      this.rooms = rooms;
   }

   public String getName()
   {
      return name;
   }

   public int getNumberOfRooms()
   {
      return rooms.length;
   }

   public int getNumberOfAvailableRooms()
   {
      int counter = 0;
      for (int i = 0; i < rooms.length; i++)
         if (rooms[i].isOccupied() == false)
            counter++;
      return counter;
   }

   public Room getFirstAvailableRoom()
   {
      for (int i = 0; i < rooms.length; i++)
         if (rooms[i].isOccupied() == false)
            return rooms[i];
      return null;
   }

   public Room getFirstAvailableRoom(double maxPrice)
   {
      for (int i = 0; i < rooms.length; i++)
         if (rooms[i].isOccupied() == false && rooms[i].getPrice() <= maxPrice)
            return rooms[i];
      return null;
   }

   public int getNumberOfAvailableSuites()
   {
      int counter = 0;
      for (int i = 0; i < rooms.length; i++)
         if (rooms[i].isOccupied() == false && rooms[i] instanceof Suite)
            counter++;
      return counter;
   }

   public Room[] getAllAvailableRooms(String bedType)
   {
      Room[] result = new Room[rooms.length];
      for (int i = 0; i < rooms.length; i++)
         if (!(rooms[i].isOccupied()))
            result[i] = rooms[i];
      return result;
   }

   public Suite[] getAllAvailableSuites(String bedType)
   {
      Suite[] result = new Suite[rooms.length];
      for (int i = 0; i < rooms.length; i++)
         if (!(rooms[i].isOccupied()) && rooms[i] instanceof Suite)
            result[i] = (Suite) rooms[i];
      return result;
   }

   public boolean hasGueust(Guest guest) {
      for(int i = 0 ; i < rooms.length; i++)
         if(rooms[i].getGuest().equals(guest))
            return true;
      return false;
   }

   public Room getRoom(Guest guest)
   {
      for(int i = 0 ; i < rooms.length; i++)
         if(rooms[i].getGuest().equals(guest))
            return rooms[i];
      return null;
   }
}
