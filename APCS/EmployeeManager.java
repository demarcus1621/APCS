public class EmployeeManager extends EmpolyeeGroup
{
   public String department;
   
   public EmployeeManager()
   {
   }
   
   public EmployeeManager( String s , int i , String str )
   {
      super(s,i);
      department = str;
   }
   
   public String toString()
   {
      String s = "Name: " + super.getName(); + " Salary: " + super.getSalary() + " " + this.department+" Department: ";
      return s;
   }
}      