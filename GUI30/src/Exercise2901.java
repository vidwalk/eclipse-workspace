import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
   JLabel label;
   JButton step;

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
      label = new JLabel("");
      step = new JButton("Step Forward");
   }

   void initializeComponents()
   {
      setSize(600, 400); // set frame size
      setVisible(true);
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldDay.setText("");
      textFieldMonth.setText("");
      textFieldYear.setText("");
      label.setText("");
      label.setForeground(Color.red);
      DateHandler DateHandler = new DateHandler(label, show);
      step.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event)
         {
            int dayDate = Integer.parseInt(textFieldDay.getText());
            int monthDate = Integer.parseInt(textFieldMonth.getText());
            int yearDate = Integer.parseInt(textFieldYear.getText());
            MyDate date = new MyDate(monthDate, dayDate, yearDate);
            date.stepForwardOneDay();
            label.setText("" + date.toString());
         }
      });
      show.addActionListener(DateHandler);
      show.requestFocus();
   }

   void addComponentsToFrame()
   {
      JPanel panelDegreeText1 = new JPanel(new BorderLayout(1, 5));
      JPanel panelDegreeText2 = new JPanel(new BorderLayout(1, 5));
      JPanel panelDegreeText3 = new JPanel(new BorderLayout(1, 5));
      JPanel panelDegree1 = new JPanel(new BorderLayout(1, 5));
      JPanel panelDegree2 = new JPanel(new BorderLayout(1, 5));
      JPanel panelDegree3 = new JPanel(new BorderLayout(1, 5));
      JPanel panelDegree4 = new JPanel(new BorderLayout(1, 5));
      panelDegree4.add(label, BorderLayout.NORTH);
      panelDegree1.add(day, BorderLayout.WEST);
      panelDegree2.add(month, BorderLayout.WEST);
      panelDegree3.add(year, BorderLayout.WEST);
      panelDegreeText1.add(textFieldDay, BorderLayout.CENTER);
      panelDegreeText2.add(textFieldMonth, BorderLayout.CENTER);
      panelDegreeText3.add(textFieldYear, BorderLayout.CENTER);

      JPanel panelButtons = new JPanel(new GridLayout(2, 1, 5, 5));
      panelButtons.add(step);
      panelButtons.add(show);

      JPanel contentPane = new JPanel(new FlowLayout());
      JPanel gridPanel1 = new JPanel(new GridLayout(3, 2, 0, 4));
      JPanel gridPanel2 = new JPanel(new GridLayout(3, 2, 0, 4));
      JPanel gridDegree4 = new JPanel(new BorderLayout(1, 5));
      gridDegree4.add(panelDegree4);
      gridPanel1.add(panelDegree1);
      gridPanel1.add(panelDegree2);
      gridPanel1.add(panelDegree3);
      gridPanel2.add(panelDegreeText1);
      gridPanel2.add(panelDegreeText2);
      gridPanel2.add(panelDegreeText3);
      contentPane.add(gridDegree4);
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

class DateHandler implements ActionListener
{
   private JLabel label;
   private JButton button;

   public DateHandler(JLabel label, JButton button)
   {
      this.label = label;
      this.button = button;
   }

   public void actionPerformed(ActionEvent event)
   {
      MyDate date = new MyDate();
      date = MyDate.now();
      label.setText("" + date.toString());
   }
}
