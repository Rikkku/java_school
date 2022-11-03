import java.util.Scanner;
public class boolean_ppb {

	public static void main(String[] args) {
		
		
		System.out.println("Enter only Y and N" );
		System.out.print("Do you have a permit? ");
		
		
		Boolean pmt = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;
	
		if(pmt == true) {
		System.out.print("Do you have a paper? ");
		}else if (pmt == false) System.out.print("Do you have a paper? ");
				
		Boolean pmt1 = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;
		
		if(pmt1 == true) {
			System.out.print("Do you have a ballpen? ");
		}else if (pmt1 == false) {
		System.out.print("Do you have a ballpen? ");
		}
		
		Boolean pmt2 = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;
		
		
		if(pmt == true && pmt1 == true && pmt2 == true) System.out.print("You may procceed with the exam");
		
		else if(pmt == true && pmt1 == true && pmt2 == false) System.out.print("Please provide Ballpen and you may continue");
		
		else if(pmt == true && pmt1 == false && pmt2 == false) System.out.print("Please provide Paper and Ballpen");
		
		else if(pmt == true && pmt1 == false && pmt2 == true) System.out.print("Provide Paper and you may continue");
		
		else if(pmt == false && pmt1 == false && pmt2 == false) System.out.print("Get a permit first, provide paper and ballpen");
		
		else if(pmt == false && pmt1 == true && pmt2 == true) System.out.print("Get a permit first and you may procceed");
		
		else if(pmt == false && pmt1 == false && pmt2 == true) System.out.print("Provide Permit and Paper and you may continue ");
		
		else if(pmt == false && pmt1 == true && pmt2 == false) System.out.print("Provide permit and ballpen");
		
		
		
		}
	}
