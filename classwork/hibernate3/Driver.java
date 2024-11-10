package projects1;

/*
 * Session which given us physical connection to database 
 * session factory interface 
 */
public class Driver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configurqation().configure().buildSessionFactory();
		// Get Session from session factory
		Session session = sf.openSession();
	//Begin transation
		Transation t = session.beginTransation();
		
		//Creating Employeee base class records
		
		Employee employee = new Employee();
		employee.setId(6);
		employee.setFirstName("Bhairav");
		employee.setLastName("Bhairav");
		session.save(employee);
		t.commit();
		System.out.println("Successfully Saved");
		
		
		

	}

}
