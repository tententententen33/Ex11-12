import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalSearchDemo1 {
	public static void main(String[] args) {
		String text = "お問い合わせは 089-123-4567、または 03-9999-8888 までお願いします。";
		Pattern p = Pattern.compile("(\\d{2,4})-(\\d{2,4})-(\\d{4})");
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.println("電話番号全体: " + m.group());
			System.out.println(" 先頭部分 : " + m.group(1));
			System.out.println(" 中央部分 : " + m.group(2));
			System.out.println(" 末尾部分 : " + m.group(3));
		}
	}
}