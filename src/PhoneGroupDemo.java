import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneGroupDemo {
	public static void main(String[] args) {
		String text = "代表番号: 089-123-4567";
		Pattern p = Pattern.compile("(\\d{2,4})-(\\d{2,4})-(\\d{4})");
		Matcher m = p.matcher(text);
		
		if(m.find()) {
			System.out.println("全体 :" + m.group());
			System.out.println("市外局番 :" + m.group(1));
			System.out.println("市内局番 :" + m.group(2));
			System.out.println("加入者番号 :" + m.group(3));
		}
	}
}
