import javax.swing.JFrame;

public class HousePrint
{
   public static void main(String[] args)
   {
      JFrame screen = new JFrame();
      screen.setSize(2000,2000);
      screen.setTitle("My House");
      screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      House building = new House();
      screen.add(building);
      screen.setVisible(true);
   }
}      
