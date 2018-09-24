import java.util.Scanner;
import java.io.InputStream;
import java.lang.Math;

public class AcslDemarcus
{
   public static void main(String[] args)
   {
      System.out.println("This is DeMarcus's ACSL assignment");
      
      Scanner scanner = new Scanner( System.in );
      int count = 5;
      String input;
      //int distance = 0;
      //int mpg = 0;
      //int road = 65;
      //int hours = 0;
      //String hour = "";
      //int minutes = 0;
      //double gas;
      //double totscost;
      //double cost;
            
      for ( int i = 1 ; i <= count ; i++ )
      {
         input = scanner.nextLine();
         String ary[] = input.split(", ");
         int distance = 0;
         int mpg = 0;
         int road = 65;
         int hours = 0;
         String hour = "";
         int minutes = 0;
         double gas = 0;
         double totscost = 0;
         double coster = 0;
               
         if ( ary[0].equal( "A" ) && ary[1].equal( "B" ))
         {
            distance = 450;
         }
         else if ( ary[0].equal( "A") && ary[1].equal( "C" ))
         {
            distance = 590;
         }
         else if ( ary[0].equals( "A" ) && ary[1].equal( "D" )
         {
            distance = 710;
         }
         else if ( ary[0].equal( "A" && ary[1].equal( "E" )
         {
            distance = 1030;
         }
         else if ( ary[0].equal( "A" && ary[1].equal( "F" )
         {
            distance = 1280;
         }
         else if ( ary[0].equal( "A" && ary[1].equal( "G" )
         {
            distance = 1360;
         }
         else if ( ary[0].equal( "B" && ary[1].equal( "B" )
         {
            distance = 0;
         }
         else if ( ary[0].equal( "B" && ary[1].equal( "C" )
         {
            distance = 140;
         }
         else if ( ary[0].equal( "B" && ary[1].equal( "D" )
         {
            distance = 260;
         }
         else if ( ary[0].equal( "B" && ary[1].equal( "E" )
         {
            distance = 580;
         }
         else if ( ary[0].equal( "B" && ary[1].equal( "F" )
         {
            distance = 830;
         }
         else if ( ary[0].equal( "B" && ary[1].equal( "G" )
         {
            distance = 910;
         } 
         else if ( ary[0].equal( "D" && ary[1].equal( "D" )
         {
            distance = 0;
         }
         else if ( ary[0].equal( "D" && ary[1].equal( "E" )
         {
            distance = 320;
         }
         else if ( ary[0].equal( "D" && ary[1].equal( "F" )
         {
            distance = 570;
         }
         else if ( ary[0].equal( "D" && ary[1].equal( "G" )
         {
            distance = 650;
         } 
         else if ( ary[0].equal( "E" && ary[1].equal( "E" )
         {
            distance = 0;
         }
         else if ( ary[0].equal( "E" && ary[1].equal( "F" )
         {
            distance = 250;
         }
         else if ( ary[0].equal( "E" && ary[1].equal( "G" )
         {
            distance = 330;
         } 
         else if ( ary[0].equal( "F" && ary[1].equal( "F" )
         {
            distance = 250;
         }
         else if ( ary[0].equal( "F" && ary[1].equal( "G" )
         {
            distance = 80;
         } 
         
         if ( ary[2].equal( "C" )
         {
            mpg = 28;
         }
         else if ( ary[2].equal( "M" )
         {
            mpg = 25;
         }
         else if ( ary[2].equal( "F" )
         {
            mpg = 22;
         }
         else if ( ary[2].equal( "V" )
         {
            mpg = 20;
         }
         
         if ( ary[3].equal( "I" )
         {
            road = 65;
         }
         else if ( ary[3].equal( "H" )
         {
            road = 60;
         }
         else if ( ary[3].equal( "M" )
         {
            road = 55;
         }
         else if ( ary[3].equal( "S" )
         {
            road = 45;
         }
         
         gas = Double.parseDouble(ary[4]);
         totscost = (  (double) distance / mpg ) * gas;
         totscost = totscost * 100;
         coster = Math.round(totscost); 
         coster = (double) coster / 100;
         
         hours = distance / road;
         minutes  = distance % road;
         
         if ( hours < 10 )
         {
            if ( hours == 1 )
            {
               hour = "01";
            }
            else if ( hours == 2 ) 
            {
               hour = "02";
            }
            else if ( hours == 3 ) 
            {
               hour = "03";
            }
            else if ( hours == 4 )
            {
               hour = "04";
            }
            else if ( hours == 5 )
            {
               hour = "05";
            }
            else if ( hours == 6 )
            {
               hour = "06";
            }
            else if ( hours == 7 )
            {
               hour = "07";
            }
            else if ( hours == 8 )
            {
               hour = "08";
            }
            else if ( hours == 9 )
            {
               hour = "09";
            }                           
            
            System.out.println(distance+", " + hour +":" +minutes + ", $" + coster);
         }
         else
         {   
            System.out.println(distance+", " + hours +":" +minutes + ", $" + coster);
         }   
      }
   }
}         