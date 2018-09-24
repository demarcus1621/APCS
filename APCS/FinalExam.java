public class FinalExam      // program written by: DeMarcus Campbell
{
   private String input;
   private int sum;        // initializing all variables before use
   private int changer1;
   private int changer2;
   private String array[];
   
   public FinalExam( String intake )  // constructor
   {
      input = intake;
   }
   
   public int calculator()
   {
      String array[] = input.split(" ");   // takes input as a string and converts it into an array without spaces
      
      if ( array.length > 1 )
      {
         changer1 = Integer.parseInt( array[0] );
         changer2 = Integer.parseInt( array[1] );
         sum = changer1 - changer2;  // calculates the first part of the array
         
         for ( int i = 2 ; i < array.length ; i++ )
         {
            if ( i % 2 == 0 )
            {
               sum = sum + Integer.parseInt( array[i] );
            }
            else                       // final parts of the calculation
            {
               sum = sum - Integer.parseInt( array[i] );
            }
         }
      }
      else                             // if array length is 1 or less
      {
         sum = Integer.parseInt( array[0] );
      }
      
      return(sum);
   }
}                  