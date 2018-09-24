public class EmployeeGroup
{
   private String name;
   private int salary;
   
   public EmployeeGroup()
   {
   }
   
   public EmployeeGroup( String s , int i )
   {
      name = s;
      salary = i;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getSalary()
   {
      return salary;
   }         
}   