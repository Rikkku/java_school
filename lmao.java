package programming_1;
import java.util.Scanner;

public class While_Index {

	public static void main(String[] args) {
		
		Scanner ans = new Scanner(System.in);
		
		String email [] = new String [4];
		String username [] = new String [4];
		String password [] = new String [4];
		
		int input = 1;
		int a = 1;
		
		while(input < email.length && input < username.length && input < password.length ) {
			System.out.println("Enter Email");
			email [a] = ans.nextLine();
			
			System.out.println("Enter Username");
			username [a] = ans.nextLine();
			
			System.out.println("Enter Password");
			password [a] = ans.nextLine();
			a++;
			input++;			
		}
		
		System.out.println("Pick account 1-3");	
		int b = ans.nextInt();
		System.out.println("Email" + email[b]);
		System.out.println("Username" + username[b]);
		System.out.println("password" + password[b]);
		

	}

}
