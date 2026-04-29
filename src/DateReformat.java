
public class DateReformat {
	public static void main(String[] args) {
		String str = "提出期限は2026/04/24です。";
		System.out.println(str.replaceAll(
				"(?<year>\\d{4})/(?<month>\\d{2})/(?<day>\\d{2})",
				"${year}年${month}月${day}日"));
	}
}
