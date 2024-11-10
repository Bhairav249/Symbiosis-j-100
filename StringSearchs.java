public class StringSearchs {
	public static int search(String value, String searchValue) {
		return value.indexOf(searchValue);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Bhairav";
		String searchValue ="kartik";
		int index =search(value, searchValue);
		if(index!=-1) {
			System.out.println("Search value found at index" +index);
		}
		else {
			System.out.println("Search value not found");
		}

	}

}
