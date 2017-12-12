import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise2902 extends JFrame
{
   JTextField xText;
   JTextField yText;
   JLabel x;
   JLabel y;
   JButton ok;
   JButton cancel;
   JButton clear;
   JCheckBox exitOk;
   JCheckBox exitCancel;

   Exercise2902()
   {
      super("Allign");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   void createComponents()
   {
      xText = new JTextField(3);
      yText = new JTextField(3);
      exitOk = new JCheckBox("Exit on Ok");
      exitCancel = new JCheckBox("Exit on Cancel");
      x = new JLabel("X:");
      y = new JLabel("Y:");
      cancel = new JButton("Cancel");
      ok = new JButton("Ok");
      clear = new JButton("Clear");
   }

   void initializeComponents()
   {
      setSize(600, 200); // set frame size
      setVisible(true);
      setLocationRelativeTo(null); // center of the screen
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      xText.setText("");
      yText.setText("");
      ok.requestFocus();
   }

   void addComponentsToFrame()
   {
      JPanel panelDegreeText = new JPanel(new GridLayout(2, 1, 0, 10));
      JPanel panelDegree = new JPanel(new GridLayout(2, 1, 3, 2));
      JPanel panelDegreeLabel = new JPanel(new GridLayout(2, 1, 0, 10));
      panelDegree.add(exitOk, BorderLayout.NORTH);
      panelDegree.add(exitCancel, BorderLayout.SOUTH);
      panelDegreeLabel.add(x);
      panelDegreeText.add(xText);
      panelDegreeLabel.add(y);
      panelDegreeText.add(yText);

      JPanel panelButtons = new JPanel(new GridLayout(3, 1, 0, 4));
      panelButtons.add(ok, BorderLayout.NORTH);
      panelButtons.add(cancel, BorderLayout.CENTER);
      panelButtons.add(clear, BorderLayout.SOUTH);

      JPanel contentPane = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
      JPanel gridPanel1 = new JPanel(new FlowLayout());
      gridPanel1.add(panelDegreeLabel);
      gridPanel1.add(panelDegreeText);
      contentPane.add(panelDegree);
      contentPane.add(gridPanel1);
      contentPane.add(panelButtons);

      setContentPane(contentPane);
   }

   public static void main(String[] args)
   {
      Exercise2902 frame = new Exercise2902();
   }
}
