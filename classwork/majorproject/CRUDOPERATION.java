package majorprojects;

public class CRUDOPERATION {
	
	static {
		cn = DButil.getConnection();
		if(cn!=null)
			System.out.println("Jdbc connection is taken ");
		 
	}

}
