public class Palindrome {
    public static void main(String args[])
    {
        String s = "malayalam";
        if(palindrome(s))
        {
            System.out.println(s+" is palindrome");
        }
        else
        {
            System.out.println(s+" is not a palindrome");
        }
    }
    public static boolean palindrome(String s)
    {
        boolean result = true;
        int l = s.length();
        for(int i=0;i<l/2;i++)
        {
            if(s.charAt(i) != s.charAt(l-1-i))
            {
                result = false;
            }
        }
        return result;
    }
}
