import java.io.InputStream;
import java.util.Scanner;

public class StringProblems
{
   public static void main(String[] args)
   {
      int choice;
      Scanner scanner = new Scanner( System.in );
      
      System.out.println("What program do you want to run?");
      System.out.println("  1) Password Stuff");
      System.out.println("  2) Website Maker");
      System.out.println("  3) Case Changer");
      choice = scanner.nextInt();
      boolean character = false;
      boolean number = false;
      boolean letter = false;
      boolean char2 = false;
      boolean num2 = false;
      boolean let2 = false;
      
      switch ( choice )
      {
         case 1:
            System.out.println("What is the first password");
            String pass = scanner.nextLine();
            System.out.println("What is the second password");
            String pass2 = scanner.nextLine();
            if ( pass.length() < pass2.length() )
            {
               System.out.println("The lowest length is " + pass2.length() );
               for ( int i = 0 ; i < pass2.length() ; i++ )
               {
                  if ( Character.valueOf(pass2.charAt(i)).isDigit(pass2.charAt(i)) == true )
                  {
                     number = true;
                  }
                  else if ( (Character.valueOf(pass2.charAt(i))).isLetter(pass2.charAt(i)) == true )
                  {
                     letter = true;
                  }
                  else if ( (Character.valueOf(pass2.charAt(i)) ).toString()== "!" || (Character.valueOf(pass2.charAt(i)) ).toString()== "@" || (Character.valueOf(pass2.charAt(i)) ).toString()== "$" || (Character.valueOf(pass2.charAt(i)) ).toString()== "%" || (Character.valueOf(pass2.charAt(i)) ).toString()== "&" || (Character.valueOf(pass2.charAt(i)) ).toString()== "*" )
                  {
                     character = true;
                  }
               }
               if ( character == true && number == true && letter == true )
               {
                  System.out.println("Your password is good");
               }
               else
               {
                  System.out.println("Your password is not good");
               }      
            } 
            if ( pass.length() > pass2.length() )
            {
               System.out.println("The lowest length is " + pass.length() );
               for ( int i = 0 ; i < pass.length() ; i++ )
               {
                  if ( Character.valueOf(pass.charAt(i)).isDigit(pass.charAt(i)) == true )
                  {
                     number = true;
                  }
                  else if ( Character.valueOf(pass.charAt(i)).isLetter(pass.charAt(i)) == true )
                  {
                     letter = true;
                  }
                  else if ( (Character.valueOf(pass.charAt(i)) ).toString()== "!" || (Character.valueOf(pass.charAt(i)) ).toString()== "@" || (Character.valueOf(pass.charAt(i)) ).toString()== "$" || (Character.valueOf(pass.charAt(i)) ).toString()== "%" || (Character.valueOf(pass.charAt(i)) ).toString()== "&" || (Character.valueOf(pass.charAt(i)) ).toString()== "*" )
                  {
                     character = true;
                  }
               }
               if ( character == true && number == true && letter == true )
               {
                  System.out.println("Your password is good");
               }
               else
               {
                  System.out.println("Your password is not good");
               }
            }
            if ( pass.length() == pass2.length() )
            {
               System.out.println("They have the same length");
               for ( int i = 0 ; i < pass2.length() ; i++ )
               {
                  if ( Character.valueOf(pass2.charAt(i)).isDigit(pass2.charAt(i)) == true )
                  {
                     number = true;
                  }
                  else if ( Character.valueOf(pass2.charAt(i)).isLetter(pass2.charAt(i)) == true )
                  {
                     letter = true;
                  }
                  else if ( (Character.valueOf(pass2.charAt(i)) ).toString()== "!" || (Character.valueOf(pass2.charAt(i)) ).toString()== "@" || (Character.valueOf(pass2.charAt(i)) ).toString()== "$" || (Character.valueOf(pass2.charAt(i)) ).toString()== "%" || (Character.valueOf(pass2.charAt(i)) ).toString()== "&" || (Character.valueOf(pass2.charAt(i)) ).toString()== "*" )
                  {
                     character = true;
                  }
               }
               for ( int i = 0 ; i < pass.length() ; i++ )
               {
                  if ( Character.valueOf(pass.charAt(i)).isDigit(pass.charAt(i)) == true )
                  {
                     num2 = true;
                  }
                  else if ( Character.valueOf(pass.charAt(i)).isLetter(pass.charAt(i)) == true )
                  {
                     let2 = true;
                  }
                  else if ( (Character.valueOf(pass.charAt(i)) ).toString()== "!" || (Character.valueOf(pass.charAt(i)) ).toString()== "@" || (Character.valueOf(pass.charAt(i)) ).toString()== "$" || (Character.valueOf(pass.charAt(i)) ).toString()== "%" || (Character.valueOf(pass.charAt(i)) ).toString()== "&" || (Character.valueOf(pass.charAt(i)) ).toString()== "*" )
                  {
                     char2 = true;
                  }
               }
               if ( character == true && number == true && letter == true && char2 == true && num2 == true && let2 == true ) 
               {
                  System.out.println("Your passwords are good");
               }
               else
               {
                  System.out.println("Your passwords are not good");
               } 
            }
            break;              
         case 2:
            System.out.println("What is your name");
            String name = scanner.nextLine();
            System.out.println("www."+name+".com");
            break;
         case 3:
            System.out.println("What is the word");
            String word = scanner.nextLine();
            String lword = word.toLowerCase();
            String uword = word.toUpperCase();
            System.out.println(word+" "+lword+" "+uword);
            break;
      }
   }
}            