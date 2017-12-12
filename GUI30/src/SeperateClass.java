import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SeperateClass
{

   private JFrame win;
   
   public SeperateClass()
   {
      win = new JFrame("A Simple window");

      win.setSize(400, 300);

      // Specify what happens when the window are closed
      // Exit the application
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton buttonOK = new JButton("OK");
      ButtonHandler buttonHandler = new ButtonHandler(win, buttonOK); 
      buttonOK.addActionListener(buttonHandler);
      win.getContentPane().add(buttonOK);
      win.setVisible(true);
   }
   
   public static void main(String[] args)
   {
      new SeperateClass();
   }

}

class ButtonHandler implements ActionListener
{
  private JFrame frame;
  private JButton button;
  public ButtonHandler(JFrame frame, JButton button)
  {
    this.frame = frame;
   this.button = button;
  }
  public void actionPerformed(ActionEvent event)
  {
     JOptionPane.showMessageDialog(frame, "POP UP");
     button.setText("Seperate Class");
  }
}

