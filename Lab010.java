package Lab010;

public class Lab010 {
	
	public static void main(String[] args) {
		
		int attempts = 0;
		
		while(attempts<3) {
			
			String username = "Admin";
			String password = "Admin";
			
			if(username.equals("admin") && password.equals("Admin"))
				
			{
				
				System.out.println("Login Success");
				
				break;
				
			}
			
			else 
				
			{
			
				System.out.println("Login Failed");
				
			}
			
			attempts++;
			
		}
		
		if(attempts==3)
			
		{
			
			System.out.println("Account Locked");
			
		}
	}

}
