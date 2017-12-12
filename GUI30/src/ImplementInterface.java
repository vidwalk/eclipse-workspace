import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ImplementInterface implements ActionListener
{

   private JFrame win;
   private JButton buttonOK; 

   
   public ImplementInterface()
   {
      win = new JFrame("A Simple window");

      win.setSize(400, 300);

      // Specify what happens when the window are closed
      // Exit the application
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonOK = new JButton("OK");
      buttonOK.addActionListener(this);
      win.getContentPane().add(buttonOK);
      win.setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent arg0)
   {
      JOptionPane.showMessageDialog(win, "POP UP");
      buttonOK.setText("Implement Interface");
   }
   
   public static void main(String[] args)
   {
      new ImplementInterface();

   }




}
