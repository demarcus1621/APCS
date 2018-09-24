import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{
   private int forward;
   private int length;
   
   public SpiralBug( int intake )
   {
      length = intake;
      forward = 0;
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
            turn();
            turn();
            length++;
            forward = 0;
        } 
   }
}             