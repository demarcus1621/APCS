import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;

public class SpiralRun
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      SpiralBug Ham = new SpiralBug(3);
      world.add(new Location(5, 5), Ham);
      world.show();
   }
}      