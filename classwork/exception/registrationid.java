import userDefined.invalidCountryException;
import userDefined.userException;
import userDefined.userdefinedexception;

class  userException extends Exception{
	public userException(String a) {
		super(a);
	}
}

class invalidCountryException extends Exception{
	public invalidCountryException(String a) {
		super(a);
	}
}

public class registrationid {

	String name;
	double age;
	String Address;
	
    public void registerUser(String userName) throw  invalidUserException, userException{
 	   if(!countryName.equals("Bhairav")) {
 		   throw new invalidUserException("Enter valid name");
 	   }
 	   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userdefinedexception ud1 = new userdefinedexception();
		try {
			ud1.registerUser("test");
			catch(invalidCountryException | userException  e)
			{System.out.println(e.getMessage());
         
	      }
			
			catch (UserNotFoundException e) {
				System.out.println(e.getMessage());
				
			}

}
