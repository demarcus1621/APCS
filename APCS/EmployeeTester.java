public class EmployeeTester
{
   public static void main(String[] args)
   {
      Employee dave = new Employee();
      Employee turner = new Employee("Turner", 1492);
      
      System.out.println(dave.getName());
      System.out.println(turner.getName());
      
      System.out.println();
      
      dave.setName("Name has been changed");
      System.out.println(dave.getName());
      turner.setName("Name has been changed");
      System.out.println(turner.getName());
      
      System.out.println();
      
      System.out.println(dave.getSalary());
      System.out.println(turner.getSalary());
      
      dave.setSalary(100);
      System.out.println(dave.getSalary());
      turner.setSalary(100);
      System.out.println(turner.getSalary());
      
      System.out.println();
      
      dave.raiser(100);
      turner.raiser(100);
      System.out.println(dave.getSalary());
      System.out.println(turner.getSalary());
   }
}      