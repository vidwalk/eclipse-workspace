import javax.swing.JFrame;


public class ASimpleWindow2 extends JFrame 
{

   public ASimpleWindow2() 
   {
      super("A Simple window 2");

      setSize(300, 200);
      setVisible(true);

      // Specify what happens when the window are closed
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args)
   {
      new ASimpleWindow2();
   }
}
