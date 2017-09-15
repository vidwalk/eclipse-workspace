
public class FirstProblem
{
 public static void main(String[] args)
 {  int newYear = 365;
    int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    for(int i = 0; i < 12; i++)
       { newYear = newYear - days[i];
       System.out.println(newYear);
       }
 }
}
