package programming_1;
import java.util.Scanner;
public class Short_Menu {

	public static void main(String[] args) {
		
		
		int menu= 10;
		Scanner ask1 = new Scanner(System.in);
		
		System.out.println("Press 1 - 5 only");
		System.out.println("1. Main Course");
		System.out.println("2. Desert");
		System.out.println("3. Drinks");
		System.out.println("4. Finish order");
		System.out.println("5. Exit");
		
		menu = ask1.nextInt();
		
		switch(menu) {
		
		case 0:

			System.out.println("Press 1-5 only");
			System.out.println("1. Main Course");
			System.out.println("2. Desert");
			System.out.println("3. Drinks");
			System.out.println("4. Finish order");
			System.out.println("5. Exit");
		
		
		case 1: 
			System.out.println("--- Main Course ---");
			System.out.println("1. Chicken Fillet");
			System.out.println("2. Chicken Fillet/ Apple pie");
			
			if (menu == 1) {
				System.out.println("Choose size");
				System.out.println("1. Ala Carte");
				System.out.println("2. King Size ");
				int Mc0 = new Scanner(System.in).nextInt();
				
				if (Mc0 == 1)System.out.print("Ala carte");
				
				}else{
					System.out.print("King size");
					return;
				}
			
			
			
			
			
		}
		
		
	}

}
