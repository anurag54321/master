import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		System.out.println(isAnagram("acb", "bac"));

	}

	private static boolean isAnagram(String s12, String s21) {
		String s1 = s12.replaceAll("\\s", "");
		String s2 = s21.replaceAll("\\s", "");
		if (s1.length() != s2.length())
			return false;
		char[] str = s1.toUpperCase().toCharArray();
		char[] str1 = s2.toUpperCase().toCharArray();
		Arrays.sort(str);
		Arrays.sort(str1);
		boolean status = Arrays.equals(str, str);
		if (status) {
			return true;
		}
		return false;

	}

}
