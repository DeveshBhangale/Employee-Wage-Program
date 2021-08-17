interface EmployeeWage{

	public void companyWage(String companyName,int WagePerHour,int totalWorkingHours,int totalWorkingDays);

	public int monthlyWage(int WagePerHour,int FullDay,int totalDays);	

	public void companyWage(String companyName);
		
}
//Use Case - 10
class CompanyEmpWage implements EmployeeWage{
	
	public final int WagePerHour;
	public final int totalWorkingDays;
	public final int totalWorkingHours;
	public final String companyName;
	
	//	Use Case - 9
	public CompanyEmpWage(String companyName,int WagePerHour,int totalWorkingHours,int totalWorkingDays) {
		this.companyName = companyName;
		this.WagePerHour = WagePerHour;	
		this.totalWorkingHours = totalWorkingHours;
		this.totalWorkingDays = totalWorkingDays;
	}
	
	public void companyWage(){
		int total = ((WagePerHour * totalWorkingHours) * totalWorkingDays);
		System.out.println("Company Wage of "+companyName +" is "+ total +"\n");
	}

	@Override
	public void companyWage(String companyName, int WagePerHour, int totalWorkingHours, int totalWorkingDays) {

		
	}

	@Override
	public int monthlyWage(int WagePerHour, int FullDay, int totalDays) {
		return 0;
	}

	@Override
	public void companyWage(String companyName) {
		
	}
	
}
