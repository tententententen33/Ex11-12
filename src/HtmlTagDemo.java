import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagDemo {
	public static void main(String[] args) {
		String html = "<a href=\"https://example.com\">公式サイト</a>";
		//String html = "<a href=\"A\">X</a><a href=\"B\">Y</a>"; 
		Pattern p = Pattern.compile("<a\\s+href=\"(.*?)\">(.*?)</a>");
		Matcher m = p.matcher(html);

		while (m.find()) {
			System.out.println("リンク先 URL : " + m.group(1));
			System.out.println("表示文字列 : " + m.group(2));
		}
	}
}