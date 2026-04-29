import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierDemo {
	public static void main(String[] args) {
		String text = "a aa aaa b";
		Pattern p = Pattern.compile("a+");
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.println("見つかった文字列: " + m.group());
		}
	}
}
