
public class EmpWage {
	public static void main(String[] args) {
		int FullDay = 8;
		int WagePerHour= 20;
		int PartTime = 8;
		
		// Use Case - 1
		double random = Math.random();
		System.out.println(random);
		double empCheck = Math.floor(random* 10) % 2;
		if(empCheck == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is not Present");
		
		if(empCheck == 1) {
			
			// Use Case - 2
			System.out.println("Daily Wage of Employee is " + Integer.toString(WagePerHour*FullDay));
		}
	}
}
