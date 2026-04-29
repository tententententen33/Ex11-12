public class NamedReplaceDemo {
	public static void main(String[] args) {
		String text = "電話番号: 089-123-4567";
		String result = text.replaceAll(
				"(?<area>\\d{2,4})-(?<local>\\d{2,4})-(?<number>\\d{4})",
				"(${area}) ${local}-${number}");
		System.out.println(result);
	}
}