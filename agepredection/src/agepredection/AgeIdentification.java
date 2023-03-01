package agepredection;
import java.util.Scanner;


public class AgeIdentification {

	
	
	
	
	public void checkAge() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("do you want to check the age limit please use 'yes' for do and 'no'for close");
		
		String check=scanner.next();
		switch(check) {
		case "yes":
			//Scanner scanner=new Scanner(System.in);
			System.out.println("okay please enter your age ");
			int age=scanner.nextInt();
			if(age >= 18)
				System.out.println("yes sir you are eligible");
			else if(age<=18)
				System.out.println("not eligible");
			
			
	
			break;
		case "no":
			System.out.println("thank you for your time sir ");
			break;
			
		}
			
		
		
	}
			
		
		
		
	
	
	
	public static void main(String args[]) {
		AgeIdentification ageidentification=new AgeIdentification();
		
		
	}
	
	
	
}
