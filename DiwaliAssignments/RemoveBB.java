
public class RemoveBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abbaca";
		String remove = "bb";
		String output = input.replace(remove, "");
		System.out.println(output);
		String result = output.substring(0, output.length() -2);
		System.out.println(result);
	
	}

}
