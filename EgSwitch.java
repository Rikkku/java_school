package programming_1;
import java.util.Scanner;
public class EgSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input your size between 1-10     ");

		
		
		int a = 10;
		a = sc.nextInt();
		
		
		switch(a){
			case 1:
				
			case 2:
				
			case 3:
				System.out.print("Small size");
				break;
				
			case 4: 
				
			case 5:
				
			case 6:
				System.out.print("Medium size");
				break;
			case 7: 
				
			case 8:
				
			case 9:
				System.out.print("Large size");
				break;
			case 10:
				System.out.print("Extra large");	
		}
	}
}
