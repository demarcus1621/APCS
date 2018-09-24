import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;

public class CircleBugRunner
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      CircleBug Turner = new CircleBug(3);
      Turner.setColor(new Color(255,0,0));
      BoxBug Jacoba = new BoxBug(3);
      world.add(new Location(7, 8), Turner);
      world.add(new Location(5, 5), Jacoba);
      world.show();
   }   
}   