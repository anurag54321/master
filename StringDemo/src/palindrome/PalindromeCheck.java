package palindrome;

class PalindromeCheck {

	public static boolean isPal(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))

			return isPal(s.substring(1, s.length() - 1));

		return false;
	}

	public static void main(String[] args) {
		String string = "AB";
		if (isPal(string))
			System.out.println(string + " is a palindrome");
		else
			System.out.println(string + " is not a palindrome");
	}
}