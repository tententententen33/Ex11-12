import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameGroupDemo {
	public static void main(String[] args) {
		String text = "089-123-4567";
		Pattern p = Pattern.compile(
				"(?<area>\\d{2,4})-(?<local>\\d{2,4})-(?<number>\\d{4})");
		Matcher m = p.matcher(text);

		if (m.matches()) {
			System.out.println("市外局番: " + m.group("area"));
			System.out.println("市内局番: " + m.group("local"));
			System.out.println("加入者番号: " + m.group("number"));
		}
	}
}