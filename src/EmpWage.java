import java.util.*;


public class EmpWage {
	public static int FullDay = 8;
	public static int WagePerHour= 20;
	public static int PartTime = 8;
	public static int totalDays = 20;

	public EmpWage() {
	}
	//	Use Case - 8
	public EmpWage(int WagePerHour,int FullDay) {
		this.WagePerHour = WagePerHour;	
		this.FullDay = FullDay;
	}
	
	// Use Case - 7 
	public static int monthlyWage(int WagePerHour,int FullDay,int totalDays){
		return	((WagePerHour * FullDay) * totalDays);
	}
	
	//	Use Case - 8
	public void companyWage(String companyName,int totalDays){
		int total = ((WagePerHour * FullDay) * totalDays);
		System.out.println("Company Wage of "+companyName +" is "+ total +"\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. To check Employee is Present or Not \n"
					+ "2. To Calculate Daily Wage of Employee\n"
					+ "3. To Calculate Part Time Wage of Employee\n"
					+ "4. To Calculate Wages for a Month\n"
					+ "5. To Calculate Wages for 100 hours or 20 Days\n"
					+ "6. To Calculate Wages for a Month of Dmart\n"
					+ "7. To Calculate Wages for a Month of Walmart\n");
			// Use Case - 1
			int a = sc.nextInt();
			
			// Use Case - 4
			switch(a) {
			case 1:
					double random = Math.random();
					double empCheck = Math.floor(random* 10) % 2;			
					if(empCheck == 1)
						System.out.println("Employee is Present\n");
					else
						System.out.println("Employee is not Present\n");
					break;
			
			case 2:	
					// Use Case -2 
					System.out.println("Daily Wage of Employee is " + Integer.toString(WagePerHour * FullDay) + "\n");
					break;
			case 3:
					// Use Case - 3
					System.out.println("Part Time Wage of Employee is " + Integer.toString(WagePerHour * PartTime)+ "\n");
					break;
			case 4:
					// Use Case - 5 & 7
					int ans = monthlyWage(WagePerHour, FullDay, totalDays);
					System.out.println("Wages for a month of Employee is " + ans + "\n");
					break;
			case 5:
					// Use Case - 6
					System.out.println("Wages for 100 hours or 20 Days of Employee is " + (WagePerHour * (FullDay-3)) * totalDays + "\n");
					break;
			
			case 6: EmpWage Dmart = new EmpWage(10,10);
					Dmart.companyWage("Dmart",25);
					break;
			
			case 7: EmpWage Walmart = new EmpWage(15,7);
					Walmart.companyWage("Walmart",25);
					break;
				
			}
			
			}
	}
}

