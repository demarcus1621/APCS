import javax.swing.JFrame;

public class RecViewer
{
   public static void main(String[] args)
   {
      JFrame wind = new JFrame();
      wind.setSize(400,400);
      wind.setTitle("Rectangle Drawer");
      wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      RectDraw reach = new RectDraw();
      wind.add(reach);
      wind.setVisible(true);
   }
}       

      
 