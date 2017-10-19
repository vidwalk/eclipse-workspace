import java.util.ArrayList;

public class CD
{
   String title;
   ArrayList<CDTrack> trackList;
   
   public CD(String title)
   {
     this.title = title;
     this.trackList = new ArrayList<CDTrack>();
   }
   
   public void addTrack(CDTrack track)
   {
      this.trackList.add(track);
   }
   
   public String getTitle()
   {
      return this.title;
   }
   
   public Time getDuration()
   {
      int time = 0;
      for(int i = 0 ; i < this.trackList.size(); i++)
      {
         time = time + this.trackList.get(i).length.getTimeInSeconds();
      }
      Time result = new Time(time);
      return result;
   }
   
   public CDTrack getCDTrack(int trackNumber)
   {
      CDTrack result = this.trackList.get(trackNumber).copy();
      return result;
   }
   
   public String toString()
   {
      String result= "";
      result = result + this.title + "\n";
      result = result + getDuration().toString() + "\n";
      for(int i = 0 ; i < this.trackList.size(); i++)
      {
         result = result + this.trackList.get(i).toString();
         if(i < trackList.size() -1)
            result = result + "\n";
      }
      return result;
   }
}