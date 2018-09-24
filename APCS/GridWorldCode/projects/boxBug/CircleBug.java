import info.gridworld.actor.Bug;

public class CircleBug extends Bug
{
    private int forward;
    private int length;

    public CircleBug(int intake)
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
            turn();
            forward = 0;
        }
    }
}
