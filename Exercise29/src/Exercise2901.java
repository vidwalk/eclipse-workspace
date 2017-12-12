import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise2901 extends JFrame
{
   JTextField textFieldDay;
   JTextField textFieldMonth;
   JTextField textFieldYear;
   JLabel day;
   JLabel month;
   JLabel year;
   JButton show;

   Exercise2901()
   {
      super("Date GUI");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   void createComponents()
   {
      textFieldDay = new JTextField(2);
      textFieldMonth = new JTextField(2);
      textFieldYear = new JTextField(6);
      day = new JLabel("Day:");
      month = new JLabel("Month:");
      year = new JLabel("Year:");
      show = new JButton("Show");
   }

   void initializeComponents()
   {
      setSize(300, 120); // set frame size
      setVisible(true);
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldDay.setText("");
      textFieldMonth.setText("");
      textFieldYear.setText("");
      show.requestFocus();
   }

   void addComponentsToFrame()
   {
      JPanel panelDegreeText1 = new JPanel(new BorderLayout(1,5));
      JPanel panelDegreeText2 = new JPanel(new BorderLayout(1,5));
      JPanel panelDegreeText3 = new JPanel(new BorderLayout(1,5));
      JPanel panelDegree1 = new JPanel(new BorderLayout(1,5));
      JPanel panelDegree2 = new JPanel(new BorderLayout(1,5));
      JPanel panelDegree3 = new JPanel(new BorderLayout(1,5));
      panelDegree1.add(day, BorderLayout.WEST);
      panelDegree2.add(month, BorderLayout.WEST);
      panelDegree3.add(year, BorderLayout.WEST);
      panelDegreeText1.add(textFieldDay, BorderLayout.CENTER);
      panelDegreeText2.add(textFieldMonth, BorderLayout.CENTER);
      panelDegreeText3.add(textFieldYear, BorderLayout.CENTER);

      JPanel panelButtons = new JPanel(new BorderLayout(0, 5));
      panelButtons.add(show, BorderLayout.EAST);

      JPanel contentPane = new JPanel(new FlowLayout());
      JPanel gridPanel1 = new JPanel(new GridLayout(3, 1,0, 4));
      JPanel gridPanel2 = new JPanel(new GridLayout(3, 1,0, 4));
      gridPanel1.add(panelDegree1);
      gridPanel1.add(panelDegree2);
      gridPanel1.add(panelDegree3);
      gridPanel2.add(panelDegreeText1);
      gridPanel2.add(panelDegreeText2);
      gridPanel2.add(panelDegreeText3);
      contentPane.add(gridPanel1);
      contentPane.add(gridPanel2);
      contentPane.add(panelButtons);

      setContentPane(contentPane);
   }

   public static void main(String[] args)
   {
      Exercise2901 frame = new Exercise2901();
   }
}
