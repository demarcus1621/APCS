import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int forward;
    private int length;
    private int counter = 3;

    public ZBug(int intake)
    {
        forward = 0;
        length = intake;
    }

   
    public void act()
    {
        if (forward < length && canMove())
        {
            move();
            forward++;
        }
        else
        {
         if ( counter == 3 )
         {
            turn();
            turn();
            turn();
            forward = 0;
            counter--;
         }
         
         else if ( counter == 2 )
         {
            turn();
            turn();
            turn();
            turn();
            turn();
            forward = 0;
            counter--;
         }            
        }
    }
}         