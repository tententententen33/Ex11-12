
public class StringSplitRegex {
	public static void main(String[] args) {
		String str = "apple12banana345orange";
		String[] result = str.split("\\d+");
		
		for(String s : result) {
			System.out.println(s);
		}
	}
}
