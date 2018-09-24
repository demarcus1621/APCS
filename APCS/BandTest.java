import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class BandTest
{
   public static void main(String[] args)
   {
      Bands CL = new Bands("2NE1","Korea","Kpop");
      Bands BABYMETAL = new Bands("BABYMETAL","Japan","Kawaii-Metal");
      Bands Rammstein = new Bands("Rammstein","Germany","Rock");
      Bands BRCyrus = new Bands("Billy Ray Cyrus","America","Country");
      Bands array[] = {BRCyrus,CL,Rammstein,BABYMETAL};
      ArrayList <Bands> list = new ArrayList <Bands>();
      list.add(Rammstein);
      list.add(CL);
      list.add(BRCyrus);
      list.add(BABYMETAL);
      Arrays.sort(array);
      Collections.sort(list);
      for( int i = 0 ; i < array.length ; i++)
      {
         System.out.println(Bands.getName(array[i]));
         System.out.println(Bands.getName(list.get(i)));
      }   
   }
}      
          