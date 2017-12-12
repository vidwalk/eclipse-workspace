import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PrivateInnerClass
{

   private JFrame win;
   private JButton buttonOK;

   public PrivateInnerClass()
   {
      win = new JFrame("A Simple window");

      win.setSize(400, 300);

      // Specify what happens when the window are closed
      // Exit the application
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonOK = new JButton("OK");
      ButtonHandler buttonHandler = new ButtonHandler();
      buttonOK.addActionListener(buttonHandler);
      win.getContentPane().add(buttonOK);
      win.setVisible(true);
   }

   private class ButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         if (event.getSource() == buttonOK)
         {
            JOptionPane.showMessageDialog(win, "POP UP");
            buttonOK.setText("Private Inner");
         }
      }
   }

   public static void main(String[] args)
   {
      new PrivateInnerClass();
   }

}
