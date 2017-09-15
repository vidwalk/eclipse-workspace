import java.util.Scanner;

public class Multiply
{
public static void main(String[] args)
{  int a , b , c , multiply;
   Scanner scanner = new Scanner(System.in);
   a = scanner.nextInt();
   b = scanner.nextInt();
   multiply = a * b ; // we read the first 2 numbers then we multiply and print it
   System.out.println(multiply);
   c = scanner.nextInt();
   multiply = multiply * c ;
   System.out.println(multiply); // we read another number then we multiply and print it
}
}
