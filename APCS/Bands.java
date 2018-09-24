import java.lang.Comparable;

public class Bands implements Comparable <Bands>
{
   int level = 0;
   String country = "";
   String genre = "";
   String title = "";
   
   public Bands(String name, String origin, String type )
   {
      title = name;
      country = origin;
      genre = type;
   }
   
   public int level()
   {
      if( country.equals( "America" ) || country.equals( "Korea" ) || country.equals( "Japan" ) )
      {
         level = 10;
      }
      else if( country.equals("Germany") )
      {
         level = 8;
      }
      else   
      {
         level = 6;
      }
      if( genre.equals("Country") )
      {
         level -= 99999;
      }
      else if( genre.equals("Classical") )
      {
         level -= 1;
      }
      else
      {
         level += 5;
      } 
      return level; 
   }
   
   public static String getName(Bands v)
   {
      return v.title;
   }   
   
   public int compareTo(Bands in)
   {
      if( this.level() < in.level() ) return -1;
      if( this.level() == in.level() ) return 0;
      if( this.level() > in.level() ) return 1;
      return 0;
   }   
}    
