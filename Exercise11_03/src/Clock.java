
public class Clock
{
   int hour, minute, second;
   boolean is24HourFormat = true;

   public Clock(int hour, int minute, int second)
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
      if (second >= 60)
      {
         second = 0;
         minute++;
      }
      if (minute >= 60)
      {
         minute = 0;
         hour++;
      }
      if (hour >= 24)
      {
         hour = 0;
      }
   }

   public Clock(int totalSeconds)
   {
      second = totalSeconds;
   }

   public boolean is24HourFormat()
   {
      return is24HourFormat;
   }

   public void set24HourFormat()
   {
      is24HourFormat = true;
   }

   public void set12HourFormat()
   {
      is24HourFormat = false;
   }

   public int getHour()
   {
      return hour;
   }

   public int getMinute()
   {
      return minute;
   }

   public int getSecond()
   {
      return second;
   }

   public Clock copy()
   {

      Clock copyClock = new Clock(hour, minute, second);
      copyClock.hour = hour;
      copyClock.minute = minute;
      copyClock.second = second;
      return copyClock;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Clock))
      {
         return false;
      }
      Clock object = (Clock) obj;
      if (this.hour == object.getHour() && this.minute == object.getMinute()
            && this.second == object.getSecond())
         return true;
      return false;
   }

   public int converToSeconds()
   {
      return (this.hour * 3600 + this.minute * 60 + this.second);
   }

   public void set(int hour, int minute, int second)
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
      if (second >= 60)
      {
         this.second = 0;
         this.minute++;
      }
      if (minute > 59)
      {
         this.minute = 0;
         this.hour++;
      }
      if (hour >= 24)
      {
         this.hour = 0;
      }
   }

   public void tic()
   {
      this.second++;
      if (second >= 60)
      {
         second = 0;
         minute++;
      }
      if (minute >= 60)
      {
         minute = 0;
         hour++;
      }
      if (hour >= 24)
      {
         hour = 0;
      }
   }

   public boolean isBefore(Object obj)
   {
      if (!(obj instanceof Clock))
      {
         return false;
      }
      Clock object = (Clock) obj;
      if (this.hour < object.getHour())
         return true;
      if (this.hour == object.getHour() && this.minute < object.getMinute())
         return true;
      if (this.hour == object.getHour() && this.minute == object.getMinute()
            && this.second < object.getSecond())
         return true;
         return false;
   }
   
   public String toString()
   {
      String result = "";
      if(is24HourFormat())
      {
         
         result = result + this.hour + ":";
         if(minute < 10)
            result = result + "0" + this.minute + ":";
         result = result + this.minute + ":";
         if(second < 10)
            result = result + "0" + this.second;
         result = result + this.second;
      }
      else {
      
      if( hour < 12)
         {
         result = result + this.hour + ":";
         
         if(minute < 10)
            result = result + "0" + this.minute + ":";
         else
         result = result + this.minute + ":";
         
         if(second < 10)
            result = result + "0" + this.second + " AM";
         else
         result = result + this.second + " AM";
         }
      else
      {
         
         result = result + (this.hour -12) + ":";
         if(minute < 10)
            result = result + "0" + this.minute + ":";
         else
         result = result + this.minute + ":";
         
         if(second < 10)
            result = result + "0" + this.second + " PM";
         else
         result = result + this.second + " PM";
      }
      }
      return result;
   }
}
