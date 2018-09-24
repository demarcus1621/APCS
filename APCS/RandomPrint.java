import javax.swing.JFrame;

public class RandomPrint
{
   public static void main(String[] args)
   {
      JFrame screen = new JFrame();
      screen.setSize(1000,1000);
      screen.setTitle("Random Shapes");
      screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      RandomShape shape = new RandomShape();
      screen.add(shape);
      screen.setVisible(true);
   }
}      