
public class CDTrack
{
  String title;
  String artist;
  Time length;
  public CDTrack(String title, String artist, Time length)
  {
     this.title = title;
     this.artist = artist;
     this.length = length;
  }
  
  public String getTitle()
  {
     return this.title;
  }
  
  public String getArtist()
  {
     return this.artist;
  }
  
  public Time getLength()
  {
     return this.length;
  }
  
  public void setArtist(String artist)
  {
     this.artist = artist;
  }
  
  public String toString()
  {
     String result = "";
     result = result + this.artist;
     result = result + " - " + this.title;
     result = result + " (" + this.length.toString() + ")";
     return result;
  }
  
  public CDTrack copy()
  {
     CDTrack copy = new CDTrack(this.title,this.artist,this.length);
     return copy;
  }
}
