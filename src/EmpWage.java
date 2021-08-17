import java.util.Scanner;

class EmpWage implements EmployeeWage{
	public static int FullDay = 8;
	public static int WagePerHour= 20;
	public static int PartTime = 8;
	public static int totalDays = 20;
	
	
	public EmpWage() {
	}
	//	Use Case - 8
	public EmpWage(int WagePerHour,int FullDay,int totalDays) {
		this.WagePerHour = WagePerHour;	
		this.FullDay = FullDay;
		this.totalDays = totalDays;
	}

	
	
	// Use Case - 7 
	public int monthlyWage(int WagePerHour,int FullDay,int totalDays){
		return	((WagePerHour * FullDay) * totalDays);
	}
	
	//	Use Case - 8
	public void companyWage(String companyName){
		int total = ((WagePerHour * FullDay) * totalDays);
		System.out.println("Company Wage of "+companyName +" is "+ total +"\n");
	}
	@Override
	public void companyWage(String companyName, int WagePerHour, int totalWorkingHours, int totalWorkingDays) {
		// TODO Auto-generated method stub
		
	}
	

	
}

