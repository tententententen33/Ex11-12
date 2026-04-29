import java.util.regex.Pattern;

public class OptionalDemo {
	public static void main(String[] args) {
		String[] words = { "color", "colour", "colouur" };
		Pattern p = Pattern.compile("colou?r");

		for (String word : words) {
			System.out.println(word + " -> " + p.matcher(word).matches());
		}
	}
}