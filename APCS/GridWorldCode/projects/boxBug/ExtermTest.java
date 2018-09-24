import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;

public class ExtermTest
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      ExterminatorBug ava = new ExterminatorBug(99);
      world.add(new Location(0,0) , ava);
      SpiralBug taimur = new SpiralBug(5);
      world.add(new Location(5,5) , taimur);
      world.show();
   }
}      