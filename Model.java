import java.util.*; 

public class Model {
	
	//Temporary test stores
	private String storedUser = "user";
	private String storedPass = "password";
	

	
	public String validate(String Username, String Password){
		
		if(Username.equals(storedUser) && Password.equals(storedPass)){
		return "Success!";
		}
		else{
		return "Failure!";
		}
	}
	
}
