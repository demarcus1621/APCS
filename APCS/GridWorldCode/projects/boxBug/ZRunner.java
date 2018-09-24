import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;


public class ZRunner
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      ZBug Henry = new ZBug(5);
      Henry.setDirection(Location.EAST);
      Henry.setColor(new Color(255,0,0));
      BoxBug Jacoba = new BoxBug(5);
      CircleBug Turner = new CircleBug(3);
      world.add(new Location(7, 8), Henry);
      world.add(new Location(5, 5), Jacoba);
      world.show();
   }
}      