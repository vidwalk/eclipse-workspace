import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise2903 extends JFrame
{
JButton key0;
JButton key1;
JButton key2;
JButton key3;
JButton key4;
JButton key5;
JButton key6;
JButton key7;
JButton key8;
JButton key9;
JButton keyBar;
JButton keyStar;
JButton keyMinus;
JButton keyPlus;
JButton keyEquals;
JButton keyDot;
JTextField text;

Exercise2903(){
   super("Calculator");
   createComponents();
   initializeComponents();
   addComponentsToFrame();
}
void createComponents()
{
   key0= new JButton("0");
   key1= new JButton("1");
   key2= new JButton("2");
   key3= new JButton("3");
   key4= new JButton("4");
   key5= new JButton("5");
   key6= new JButton("6");
   key7= new JButton("7");
   key8= new JButton("8");
   key9= new JButton("9");
   keyBar= new JButton("/");
   keyStar= new JButton("*");
   keyMinus= new JButton("-");
   keyPlus= new JButton("+");
   keyEquals= new JButton("=");
   keyDot= new JButton(".");
   text = new JTextField("6");

}
void initializeComponents()
{
   setSize(600, 200);
   setVisible(true);
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   text.setText("");
}
void addComponentsToFrame()
{
   JPanel gridNumbers = new JPanel(new GridLayout(4,4));
   JPanel centrePane = new JPanel(new BorderLayout());
   gridNumbers.add(key7);
   gridNumbers.add(key8);
   gridNumbers.add(key9);
   gridNumbers.add(keyBar);
   gridNumbers.add(key4);
   gridNumbers.add(key5);
   gridNumbers.add(key6);
   gridNumbers.add(keyStar);
   gridNumbers.add(key1);
   gridNumbers.add(key2);
   gridNumbers.add(key3);
   gridNumbers.add(keyMinus);
   gridNumbers.add(key0);
   gridNumbers.add(keyDot);
   gridNumbers.add(keyEquals);
   gridNumbers.add(keyPlus);
   centrePane.add(text,BorderLayout.NORTH);
   centrePane.add(gridNumbers,BorderLayout.CENTER);
   setContentPane(centrePane);
}

public static void main(String[] args)
{
   Exercise2903 frame = new Exercise2903();
}
}
