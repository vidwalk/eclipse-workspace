
public class Elevator
{
   int floor;
   int capacity;
   int maximumLoad;
   int currentLoad;
   
   public Elevator(int floor, int capacity)
   {
      this.floor = floor;
      this.capacity = capacity;
      this.maximumLoad = this.capacity * 75;
      this.currentLoad = 0;
   }
   public int getFloor()
   {
      return this.floor;
   }
   
   public int getCapacity()
   {
      return this.capacity;
   }
   
   public int getMaximumLoad()
   {
      return this.maximumLoad;
   }
   
   public int getCurrentLoad()
   {
      return this.currentLoad;
   }
   
   public void personEnter()
   {
      this.currentLoad += 75;
   }
   
   public void personEnter(int weight)
   {
      this.currentLoad += weight;
   }
   
   public void personExit()
   {
      this.currentLoad =- 75;
   }
   
   public void personExit(int weight)
   {
      this.currentLoad =- weight;
   }
   
   public boolean isAllowedToMove()
   {
      if(this.currentLoad > this.maximumLoad)
         return false;
      return true;
   }
   
   public boolean moveToFloor(int floor)
   {
      if(isAllowedToMove()) 
      {
         this.floor = floor;
         return true;
      }
      return false;
   }
}
