package Assignmentweek1.day2;

public class Employeedetails {
	
	public void printEmployeeName(String empName,int empId) {
		System.out.println("Employee Name:empId"+empName+""+empId);
	
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employeeaddress:"+empAddress);
		
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee Salary:"+empSalary);
		
		
		
	}
	public void printEmployeeMobileNumber(long mobileNumber) {
		System.out.println("Employee number:"+mobileNumber);
		
		
	}

	public static void main(String[] args) {
		
		
		Employeedetails object=new Employeedetails();
		
		object.printEmployeeName("Sanath",21);
		object.getEmployeeAddress("203,Peruugopanapalli,Barugur,Krishnagiri-635001");
		object.printEmployeeSalary(35000.30);
		object.printEmployeeMobileNumber(9566972144l);
		
		
	
		
	}
	 
	

}
	

	


