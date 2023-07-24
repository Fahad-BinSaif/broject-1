package pr_1;

public class Employee {
	 int Emp_ID;
	   String name ;
	   String depart ;
	   double salary ;
	   double bonus ;
	   double Total_salary ; 
	   boolean resident ;
	   static int count ;
	   
	   // Constructor overloading 
	  public Employee () {
		  
		  
	  }
	  public Employee (int i , String n) {
		  Emp_ID = i ;
		  name = n ;
		  
	  }
	  public Employee (int i , String n ,boolean r ) {
		  this (i,n);
		  resident = r; 
		  
	  }
	  public Employee (int i , String n ,boolean r , String d , double s ,double b ) {
		  this (i,n,r);
		  depart = d;
		  salary = s;
		  bonus = b;
		  count++;
	  }
	  public void set_ID (int i) {
		  Emp_ID = i;
	  }
	  public void set_Name (String n) {
		  name = n;
	  } 
	  public void set_depart (String d){
		  depart = d;
	  }
	  public void set_salary (double s) {
		  salary = s;
	  }
	  
	    public void set_salary (double s , double b) {
		  this.set_salary(s);
		  bonus = b;
	  }
	   public double get_t_salary () {
		   return Total_salary = this.salary+this.bonus ;
	   }

	  public void set_resident (boolean r) {
		  resident = r;
	  }
	  
	 
	  public void print_Emp_Data () {
		  System.out.println("ID "+Emp_ID );
		  System.out.println("Name "+name );
		  System.out.println("Depart "+depart);
		  System.out.println("Salary "+salary);
		  System.out.println("Bonus "+bonus);
		  System.out.println("Resident "+resident);
		  System.out.println("Total salary "+get_t_salary ());
		  
	  }
	   

}
