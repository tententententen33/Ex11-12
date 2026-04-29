import java.util.regex.Pattern;

public class PatternSplitReuse {
	public static void main(String[] args) {
		Pattern re = Pattern.compile("\\s+");
		
		String[] a = re.split("Java		Silcer		Bronze");
		String[] b = re.split("apple\tbanana        orange");
		System.out.println(String.join(" / ", a));
		System.out.println(String.join(" / ", b));
	}
}
