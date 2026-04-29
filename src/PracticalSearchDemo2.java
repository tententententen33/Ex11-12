import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalSearchDemo2 {
	public static void main(String[] args) {
		String text = "連絡先: aoki@example.com / info@kawahara.ac.jp";
		Pattern p = Pattern.compile("[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}");
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.println("見つかったメール: " + m.group());
		}
	}
}