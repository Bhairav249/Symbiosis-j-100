
public class RemoveDuplicates {
	public static String removeDuplicates(String str)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(i==0 || str.charAt(i) !=str.charAt(i-1)) {
				sb.append(str.charAt(i));
				
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbaca";
		System.out.println("Original String:"+str);
		String result = removeDuplicates(str);
		System.out.println("String After removing adjacent duplicates:"+result);
		

	}

}
