import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Exercise2904 extends JFrame
{
   JTable table;
   String[] columnNames = { "First Name", "Last Name", "Sport", "# of Years",
         "Vegetarian" };
   Object[][] data = {
         { "Mary", "Campione", "Snowboarding", new Integer(5),
               new Boolean(false) },
         { "Alison", "Huml", "Rowing", new Integer(3), new Boolean(true) },
         { "Kathy", "Walrath", "Knitting", new Integer(2), new Boolean(false) },
         { "Sharon", "Zakhour", "Speed reading", new Integer(20),
               new Boolean(true) },
         { "Philip", "Milne", "Pool", new Integer(10), new Boolean(false) } };

   Exercise2904()
   {
      super("SimpleTableDemo");
      createComponents();
      initializeComponents();
      addComponentsToFrame();
   }

   void createComponents()
   {
      table = new JTable(data, columnNames);
   }

   void initializeComponents()
   {
      setSize(600, 200);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   void addComponentsToFrame()
   {
      JScrollPane scrollPane = new JScrollPane(table);
      table.setPreferredScrollableViewportSize(new Dimension(500, 70));
      setContentPane(scrollPane);
   }

   public static void main(String[] args)
   {
      Exercise2904 frame = new Exercise2904();
   }
}
