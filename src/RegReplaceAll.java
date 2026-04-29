
public class RegReplaceAll {
	public static void main(String[] args) {
		var str = "サポートサイトはhttps://www.uhe.ac.jp/です。";
		System.out.println(str.replaceAll(
				"(?i)http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w./?%&=-]*)?",
				"<a href=\"$0\">$0</a>"));
	}
}
