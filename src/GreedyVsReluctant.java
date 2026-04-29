import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyVsReluctant {
	public static void main(String[] args) {
		String html = "<h1>見出し</h1><p>本文</p>";
		
		System.out.println("---<.*>の結果---");
		Matcher m1 = Pattern.compile("<.*>").matcher(html);
		while(m1.find()) {
			System.out.println(m1.group());
		}
		
		System.out.println("---<.*?>の結果---");
		Matcher m2 = Pattern.compile("<.*?>").matcher(html);
		while(m2.find()) {
			System.out.println(m2.group());
		}
	}
}
