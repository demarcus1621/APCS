public class FinalExam2
{
   public static void main(String[] args)
   {
      Picture picture = new Picture("djam1.jpg");
      Sound sound = new Sound("yurt.wav");
      picture.show();
      sound.playHipHop();
      for( int i = 0 ; i < 10 ; i++ )
      {
         for( Pixel p : picture.getPixels() )
         {
            System.out.println(p.getAlpha());
            p.setRed( 255 - p.getRed() );
            p.setGreen( 255 - p.getGreen() );
            p.setBlue( 255 - p.getBlue() );
         }
         picture.repaint();
         sound.playHipHop();
         sound.linearIncreaseDecrease(5);
      }
      picture = new Picture("djam2.jpg");
      sound = new Sound("Please.wav");
      picture.show();
      for( Pixel p : picture.getPixels() )
      {
         System.out.println(p.getAlpha());
         //p.setGreen(0);
         //p.setRed(0);
         //p.setBlue(0);
      }
      picture.repaint();
      sound.playHipHop();
      sound.linearIncreaseDecrease(10);
      sound.reverse();
      picture = new Picture("corn.jpg");
      sound = new Sound("corn.wav");
      picture.show();
      for( Pixel p : picture.getPixels() )
      {
         p.setRed( 255 - p.getRed() );
         p.setGreen( 255 - p.getGreen() );
      }   
         picture.repaint();
         sound.playHipHop();
      picture = new Picture("funt.jpg");
      sound = new Sound("funt.wav");
      picture.show();
      for( int i = 0 ; i < 10 ; i++ )
      {
         for( Pixel p : picture.getPixels() )
         {
            p.setRed( 255 - p.getRed() );
            p.setBlue( 255 - p.getBlue() );
         }
         picture.repaint();
         sound.reverse();
         sound.playHipHop();
      }
   }
}            