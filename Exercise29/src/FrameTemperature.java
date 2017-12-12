import java.awt.*; import java.awt.event.*; 
import javax.swing.*;

public class FrameTemperature extends JFrame
{
  private JLabel labelTemp;
  private JTextField textFieldTemp;
  private JButton buttonToCelcius;
  private JButton buttonToFahrenheit;

  public FrameTemperature()
  {
    super("Temperature conversion");
    createComponents();
    initializeComponents();
    registerEventHandlers();
    addComponentsToFrame();
  }
 
  private void createComponents()
  {
    textFieldTemp = new JTextField(6);
    labelTemp = new JLabel("Temperature:");
    buttonToCelcius = new JButton("To Celcius");
    buttonToFahrenheit = new JButton("To Fahrenheit");
  }

  private void initializeComponents()
  {
    setSize(300, 120); // set frame size
    setVisible(true);
    setLocationRelativeTo(null); // center of the screen
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    textFieldTemp.setText("");
    buttonToCelcius.requestFocus();
  }


  private void registerEventHandlers()
  {
    ButtonHandler handler = new ButtonHandler();
    buttonToCelcius.addActionListener(handler);
    buttonToFahrenheit.addActionListener(handler);
  }
  private void addComponentsToFrame()
  {
    JPanel panelDegree = new JPanel(new BorderLayout());
    panelDegree.add(labelTemp, BorderLayout.NORTH);
    panelDegree.add(textFieldTemp, BorderLayout.SOUTH);

    JPanel panelButtons = new JPanel(new BorderLayout(0, 5));
    panelButtons.add(buttonToCelcius, BorderLayout.NORTH);
    panelButtons.add(buttonToFahrenheit, BorderLayout.SOUTH);

    JPanel contentPane = new JPanel(new FlowLayout());
    contentPane.add(panelDegree);
    contentPane.add(panelButtons);

    setContentPane(contentPane);
  }

  private class ButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      String msg = textFieldTemp.getText();
      double temperature = Double.parseDouble(msg);      
      Temperature temp = new Temperature();
      if (event.getSource() == buttonToCelcius)
      {
        double t = temp.fahrenheitToCelcius(temperature);
        msg = String.format("%s Fah = %.2f Celcius", msg, t);
      }
      else if (event.getSource() == buttonToFahrenheit)
      {
        double t = temp.celciusToFahrenheit(temperature);
        msg = String.format("%s Celcius = %.2f Fah", msg, t);
      }
      JOptionPane.showMessageDialog(null, msg);
    }
  }

  public static void main(String[] args)
  {
    FrameTemperature frame = new FrameTemperature();
  }

} // End of class FrameTemperature 
