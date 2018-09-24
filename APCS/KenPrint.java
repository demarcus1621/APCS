import javax.swing.JFrame;

public class KenPrint
{
   public static void main(String[] args)
   {
      JFrame screen = new JFrame();
      screen.setSize(1000,1000);
      screen.setTitle("Kenny McCormick");
      screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      KenFace hood = new KenFace();
      screen.add(hood);
      screen.setVisible(true);
   }
}      