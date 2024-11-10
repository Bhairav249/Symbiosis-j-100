package userDefined;

import java.util.InputMismatchException;

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

public class userdefinedexception {
       String countryName;
       public void registerUser(String countryNmae) throw  invalidCountryException, userException{
    	   if(!countryName.equals("India")) {
    		   throw new invalidCountryException("Nri not alloweds");
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
		
	}      

}
