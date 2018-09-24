public class Employee
{
  private String namer;
  private double salary;
  
  public Employee() //default constructor
  {
   namer = null;
   salary = 0;
  }
  
  public Employee( String namer, double salary ) // constuctor
  {
   this.namer = namer;
   this.salary = salary;
  }
  
  public String getName()  // returns name of employee
  {
   return(this.namer);
  }
  
  public void setName(String given) // sets name of employee
  {
   this.namer = given;
  }
  
  public double getSalary()  // returns current salary
  {
   return(this.salary);
  }
  
  public void setSalary(double giver) // sets salary to entered value
  {
   this.salary = giver;
  }
  
  public void raiser(double raiser)  // gives employee a raise of percent entered
  {
   this.salary = ((raiser/100) * this.salary) + this.salary;
  }
}  
  