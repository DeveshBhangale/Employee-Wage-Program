
import java.util.*;

//Use Case - 7 
class calculateWage{
	public int monthlyWage(int WagePerHour,int FullDay,int totalDays){
		return	((WagePerHour * FullDay) * totalDays);
	}
}


public class EmpWage {
	public static void main(String[] args) {
		int FullDay = 8;
		int WagePerHour= 20;
		int PartTime = 8;
		int totalDays = 20;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. To check Employee is Present or Not \n"
					+ "2. To Calculate Daily Wage of Employee\n"
					+ "3. To Calculate Part Time Wage of Employee\n"
					+ "4. To Calculate Wages for a Month\n"
					+ "5. To Calculate Wages for 100 hours or 20 Days");
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
					calculateWage obj1 = new calculateWage();
					int ans = obj1.monthlyWage(WagePerHour, FullDay, totalDays);
					System.out.println("Wages for a month of Employee is " + ans + "\n");
					break;
			case 5:
					// Use Case - 6
					System.out.println("Wages for 100 hours or 20 Days of Employee is " + (WagePerHour * (FullDay-3)) * totalDays + "\n");
					break;
			}
		
	}
		}
}
