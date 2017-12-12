import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AnonInnerClass
{

   private JFrame win;
   private JButton buttonOK; 

   public AnonInnerClass()
   {
      win = new JFrame("A Simple window");

      win.setSize(400, 300);

      // Specify what happens when the window are closed
      // Exit the application
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonOK = new JButton("OK");
      buttonOK.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            JOptionPane.showMessageDialog(win, "POP UP");
            buttonOK.setText("Anon Inner");
         }
      });
      win.getContentPane().add(buttonOK);
      win.setVisible(true);
 
   }
   
   public static void main(String[] args)
   {
      
      new AnonInnerClass();
     
   }

}
