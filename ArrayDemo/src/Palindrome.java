public class Palindrome {
    public static boolean isPalindrome(String word)
    {
        String s1="";
        for(int i=word.length()-1;i>0;i--)
        {
            s1= s1 + word.charAt(i);
        }
        if(s1.equalsIgnoreCase(word))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
       
        System.out.println(Palindrome.isPalindrome("DeleveleD"));
    }
}