import java.util.*;
public class EmpWage {
	public static void main(String[] args) {
		int FullDay = 8;
		int WagePerHour= 20;
		int PartTime = 8;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. To check Employee is Present or Not \n"
					+ "2. To Calculate Daily Wage of Employee\n"
					+ "3. To Calculate Part Time Wage of Employee\n");
			// Use Case - 1
			int a = sc.nextInt();
			switch(a) {
			case 1:
				double random = Math.random();
				System.out.println(random);
				double empCheck = Math.floor(random* 10) % 2;
			
				if(empCheck == 1)
					System.out.println("Employee is Present");
				else
					System.out.println("Employee is not Present");
				break;
			
			case 2:	
					// Use Case -2 
					System.out.println("Daily Wage of Employee is " + Integer.toString(WagePerHour * FullDay) + "\n");
					break;
			case 3:
					// Use Case - 3
					System.out.println("Part Time Wage of Employee is " + Integer.toString(WagePerHour * PartTime)+ "\n");
					break;
			}
		
	}
		}
}
