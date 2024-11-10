import java.util.HashMap;
import java.util.Map;

class invalidageException extends Exception{
	public invalidageException(String a) {
		super(a);
	}
	
class usernotfoundsException extends Exception{	
	public usernotfoundsException(String a) {
		super(a);
		
}
}

class user{
	private int Userid;
	private String name;
	private int age;
	private String address;
	public user(int userid, String name, int age, String address) {
		super();
		Userid = userid;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
}
class usermanager() {
	private Map<Integer, User> users = new HashMap<>();
    private int nextId = 1;
    
    public int registerUser(String name, int age, String address) throws InvalidAgeException {
        if (age < 18 || age > 68) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 18 and 68.");
        }
        int userid = nextid++;
        User newUser = new user(userId, name, age address);
        users.put(userId, newUser);
        return userId;
        
        public user findUser(int userid) thorws userNotfoundException{
        	User user = users.getId(userId);
        	if(user == Null) {
        		throw new userFoundException("User With id" + userId + "not found");
        	}
        	return user;
        }
        
}
public class register {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         UserManager usermanager = new UserManager();
         
         try {
        	 int userId1 = userManager.registerUser("Bhairv", 18, "123 savarkar chowk nashik");
        	 System.out.println("Registered user with ID: " + userId1);
        	 int userId2 = userManager.registerUser("Bob", 70, "456 Oak St");
         }
         catch (UserNotFoundException e) {
        	 System.out.println(a.getMessage());
        	 
         }
	}

}
