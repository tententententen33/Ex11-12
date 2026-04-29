
public class ReplaceFirstCompare {
	public static void main(String[] args) {
		var str = "2026/04/24 2026/05/01 2026/05/08";
		
		System.out.println(str.replaceAll("/", "-"));
		System.out.println(str.replaceFirst("/", "-"));
	}
}
