import java.util.Scanner;

public class POO{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Hi there!");
		System.out.println("Enter Your Name");
		String name = Sc.nextLine();	
	    
		User_Info User1 = new User_Info();
		User1.Set_name(name);
		
        long phone_number;
		//Scanning the user input until the number has 10 digits
        do {
		System.out.println("Enter Your Phone number");
		phone_number = Sc.nextLong();
		}while(phone_number>100000000);
        
		User1.Set_phone_number(phone_number);
		
		System.out.println("Choose a one membership");
		System.out.println("1-Cardio");
		System.out.println("2-bodybuilding");
		System.out.println("3-Crossfit");
		
		int Choice = Sc.nextInt();
		switch(Choice) {
		case 1 : User1.Set_membership(User_Info.Membership.Cardio);
		case 2 : User1.Set_membership(User_Info.Membership.Bodybuilding);
		case 3 : User1.Set_membership(User_Info.Membership.Crossfit);
		}
	}
}