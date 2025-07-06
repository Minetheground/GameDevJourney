/**
 * 
 */
package survey;

import java.util.Scanner;

/**
 * 
 */
public class Main {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating user object
		UserInfo user1 = new UserInfo();
		//creating input object
		Scanner scanner = new Scanner(System.in);
	//using print function to talk to user	
		System.out.println("                                               Welcome to the User Survey");
		System.out.println("                                          Please Could You Enter Your Name");
		System.out.println("Name: ");
		//Name entry
		String name = scanner.nextLine();
		
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "                                                 Could i Also have your age please since I am a afraid");
		System.out.println("\n                                                 if you are under 13 you may not be eligable.\n");
		System.out.println("Age");
		//Age entry
		 int age = scanner.nextInt();
		 //Allow java.util.Scanner to continue on to next input
		 scanner.nextLine();
		
		System.out.println("And also include an Email for a copy of your survey answers!!");
		System.out.println("Email:");
		
		
		
		//Email Address Entry
		String email = scanner.nextLine();
		
		
		
		//filling in User Profile
		user1.Name(name);
		user1.Age(age);
		user1.Email(email);
		
		System.out.println("Would you like to confirm");
		
		user1.userProfile();
		System.out.println("Is this Info correct");
		
		System.out.println("TYPE Y for yes | N for no");
		
		String YorN = scanner.nextLine();
		
	
		
		if(YorN == "N") {
			System.out.println("Please execute program again and re-enter your details");
			
		} else if(YorN == "Y") {
			System.out.println("OK, Good");
		}
		
		//begin survey module
		System.out.println("Lets begin the Survey");
		
		

	}
	


}
