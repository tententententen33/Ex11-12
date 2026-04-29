public class Review11 {
	public static void main(String[] args) {
		String date = "2025-04-01";
		String jp = date.replaceAll("(\\d{4})-(\\d{2})-(\\d{2})", "$1 年$2月$3日");
		System.out.println(jp);

		String line = "Java, Python, C";
		String[] langs = line.split(",\\s*");
		for (String lang : langs) {
			System.out.println(lang);
		}
	}
}