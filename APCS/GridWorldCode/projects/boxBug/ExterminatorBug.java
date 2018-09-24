import info.gridworld.actor.Bug;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class ExterminatorBug extends Bug
{
   private int length;
   private int forward;
   
   public ExterminatorBug()
   {

   }
   
   public boolean bugInWay()
   {
        Grid<Actor> gr = getGrid();
        if (gr == null){
           return false;
           }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Bug neighbor = gr.get(next);
        return (neighbor instanceof Bug);
   }     
   
   public void act()
   {
        if (canMove())
            move();
        else if(bugInWay())
        {
            remove(neighbor);
        }      
        else
            turn();
   }
}               