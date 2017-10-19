
public class Time
{
   int hour;
   int minute;
   int second;
   
   public Time(int h, int m, int s)
   {
      this.hour = h;
      this.minute = m;
      this.second = s;
      if(this.hour < 0)
         this.hour = 0;
      if(this.minute < 0)
         this.minute = 0;
      if(this.minute >= 60)
         this.minute = 59;
      if(this.second >= 60)
         this.second = 59;
      if(this.second < 0)
         this.second = 0;
   }
   
   public Time(int timeInSeconds)
   {
      if(timeInSeconds > 3600)
      {this.hour = timeInSeconds/3600;
      timeInSeconds = timeInSeconds - this.hour*3600;
      }
      if(timeInSeconds > 60)
      {
      this.minute = timeInSeconds/60;
      timeInSeconds = timeInSeconds - this.minute*60;
      }
      this.second = timeInSeconds;
      if(this.hour < 0)
         this.hour = 0;
      if(this.minute < 0)
         this.minute = 0;
      if(this.minute >= 60)
         this.minute = 59;
      if(this.second >= 60)
         this.second = 59;
      if(this.second < 0)
         this.second = 0;
   }
   
   public int getHour()
   {
      return this.hour;
   }
   
   public int getMinute()
   {
      return this.minute;
   }
   
   public int getSecond()
   {
      return this.second;
   }
   
   public int getTimeInSeconds()
   {
      int result;
      result = this.hour*3600 + this.minute*60 + this.second;
      return result;
   }
   
   public void setTime(int h, int m, int s)
   {
      this.hour = h;
      this.minute = m;
      this.second = s;
      if(this.hour < 0)
         this.hour = 0;
      if(this.minute < 0)
         this.minute = 0;
      if(this.minute >= 60)
         this.minute = 59;
      if(this.second >= 60)
         this.second = 59;
      if(this.second < 0)
         this.second = 0;
   }
   
   public String toString()
   {
      String result = "";
      if (hour < 10)
      {
         result = result + "0" + hour;
      }
      else if (hour >= 24)
      {
         hour = hour - 24;
         if (hour < 10)
         {
            result = result + "0" + hour;
         }
         else
         {
            result = result + hour;
         }
      }
      else if (hour > 9 && hour < 24)
      {
         result = result + hour;
      }

      result = result + ":";

      if (minute < 10)
      {
         result = result + "0" + minute;
      }
      else if (minute >= 60)
      {
         minute = minute - 60;
         if (minute < 10)
         {
            result = result + "0" + minute;
         }
         else
         {
            result = result + minute;
         }
         hour++;
      }
      else if (minute > 9 && minute < 60)
      {
         result = result + minute;
      }

      result = result + ":";

      if (second < 10)
      {
         result = result + "0" + second;
      }
      else if (second >= 60)
      {
         second = second - 60;
         if (second < 10)
         {
            result = result + "0" + second;
         }
         else
         {
            result = result + second;
         }
         minute++;
      }
      else if (second > 9 && second < 60)
      {
         result = result + second;
      }

      return result;
   }
}
