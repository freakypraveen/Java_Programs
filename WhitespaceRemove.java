public class WhitespaceRemove {
    public static void main(String args[])
    {
        String s = "praveen kumar reddy pilli";
        System.out.println("After removing whitespaces : "+WhitespacesRemove(s));
    }
    public static String WhitespacesRemove(String s)
    {
        StringBuilder result = new StringBuilder();
        char[] ch = s.toCharArray();
        for(char c : ch)
        {
            if(!Character.isWhitespace(c))
            {
                result.append(c);
            }
        }
        return result.toString();
    }
}
