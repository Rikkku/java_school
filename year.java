package programming_1;
import java.util.Scanner;
public class Prelims_Date {

	public static void main(String[] args) {
		
		Scanner ask1 = new Scanner(System.in);
		
		int aMonth;
		int aDay;
		int aYear;
		String Month [] = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};

		System.out.print("Input Month Number : ");
		
		aMonth = ask1.nextInt();
		
		System.out.print("Input Date :");
		
		aDay = ask1.nextInt();
		
		System.out.print("Input year :");
		
		aYear = ask1.nextInt();
		
		
		switch(aMonth) {
		
		case 1:
			if(aDay <=0 && aDay >= 32  && aYear <= 1699 && aYear >= 2078) {
				System.out.println("Invalid number");
			}else if(aDay >=1 && aDay <= 31  && aYear >= 1700 && aYear <= 2077)
				System.out.println("January" + " " + aDay+ " " + aYear);
	
	
		}
	
	}
}
