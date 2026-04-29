
public class ReplaceReorder {
	public static void main(String[] args) {
		String str = "電話は089-999-0000です。";
		System.out.println(str.replaceAll(
				"(\\d{2,4})-(\\d{2,4})-(\\d{4})",
				"$1($2)-$3"));
	}
}
