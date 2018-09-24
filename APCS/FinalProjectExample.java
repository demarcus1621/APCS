public class FinalProjectExample{
  public static void main (String [] args){
     Sound sound = new Sound("laughingman6.wav");
      Picture pic = new Picture("20121123-we-are-anonymous.jpg");
      pic.show();
      sound.playHipHop();
    for(int j=0; j<5;j++){
      for (Pixel pixel : pic.getPixels()){
        pixel.setRed(255-pixel.getRed());
        pixel.setBlue(255-pixel.getBlue());
        pixel.setGreen(255-pixel.getGreen());
      }
      pic.repaint();
      sound.playHipHop();
      sound.linearIncreaseDecrease(7);
    } 
    pic = new Picture ("collision_planets_wallpaper-5180.jpg");
    pic.show();
    for (int i=0; i<10; i++){
      pic.increaseRed();
      Sound sound1=new Sound("explode.wav");
      sound1.playHipHop();
      sound1.echo(0,1);
      sound1.linearIncreaseDecrease(20);
      pic.repaint();
    }
    pic = new Picture("scan.jpg");
    pic.show();
    for (Pixel e: pic.getPixels()){
      e.setRed(e.getRed()*4);
      e.setGreen(e.getGreen()*4);
      e.setBlue(e.getBlue()*4);
    }
    pic.repaint();
    sound= new Sound("laughingman6.wav");
    sound.reverse();
    sound.playHipHop();
  }
}