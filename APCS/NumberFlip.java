  public class NumberFlip
{
    private int number;
    
    public NumberFlip( int inner )// constructor
    {
      this.number = inner;
    }   

    public int NumFlip() //fliper 
    {
              int flip = this.number % 10;
              this.number = this.number / 10;
              return flip;
    }
}
