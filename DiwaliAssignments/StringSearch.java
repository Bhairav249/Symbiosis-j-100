
public class StringSearch {
     
	public static int search(String value, String searchValue) {
		return value.indexOf(searchValue);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Bhairva Ke Vlogs";
		String searchValue = "Nahsik";
		int index = search(value, searchValue);
		if(index !=-1) {
			System.out.println("Firts Characters of search value Found at index" +index);
			
		}
		else {
			System.out.println("Search vlaue not found");
		}		

	}

}
