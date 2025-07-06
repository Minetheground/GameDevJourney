package survey;



interface UserProfile {
	
      void Name(String userName);
      
      void Age(int newValue);
      
      void Email(String emailAddress);
	
	
	void userProfile();
	
}

public class UserInfo implements UserProfile{
	
	String name;
	int age;
	String email;

	@Override
	public void Name(String userName) {

		
		
		name = userName;
		
		return;
		
	}

	@Override
	public void Age(int newValue) {

		age = newValue;
		
	}

	@Override
	public void Email(String emailAddress) {
		
		email = emailAddress;
		
	}

	@Override
	public void userProfile() {


		System.out.println("Username: " + name + "        Age: " + age + "\n Email: " + email);
		
	}



	}

	
	
	
	

	
	
	
	
	
	
	

