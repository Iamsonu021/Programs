

package day3;

public class Employee {
	int empId;
	String empName;
	
Employee(int emp_id, String name){  
	this.empId = emp_id; 
	this.empName = name;
	}  
void info() {
	System.out.println("emp_Id: "+empId+" Name: "+empName);
		   } 
public static void main(String args[]){  
	Employee obj1 = new Employee(10245,"soundarya");  
	Employee obj2 = new Employee(92232,"ammu");
	Employee obj3 = new Employee(10272,"manu");
	obj1.info();  
	obj2.info(); 
	obj3.info();
	}  
}

