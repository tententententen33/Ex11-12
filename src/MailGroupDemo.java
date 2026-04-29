import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailGroupDemo {
	public static void main(String[] args) {
		String mail = "student01@example.ac.jp";
		Pattern p = Pattern.compile("([\\w._%+-]+)@([\\w.-]+\\.[A-Za-z]{2,})");
		Matcher m = p.matcher(mail);
		
		if(m.matches()) {
			System.out.println("メール全体 :" + m.group());
			System.out.println("ユーザ名 :" + m.group(1));
			System.out.println("ドメイン名 :" + m.group(2));
		}
	}
}
