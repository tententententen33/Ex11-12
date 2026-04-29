import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Review10 {
	public static void main(String[] args) {
		String text = "連絡先は089-999-0000、予備は03-1234-5678です。";
		Pattern p = Pattern.compile("(\\d{2,4})-(\\d{2,4})-(\\d{4})");
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.println("全体: " + m.group());
			System.out.println("前半: " + m.group(1));
			System.out.println("中間: " + m.group(2));
			System.out.println("後半: " + m.group(3));
			System.out.println("-----------");
		}
	}
}
