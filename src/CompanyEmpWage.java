
//Use Case - 10
class CompanyEmpWage{
	private final int WagePerHour;
	private final int totalWorkingDays;
	private final int totalWorkingHours;
	private final String companyName;
	
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
	
}
