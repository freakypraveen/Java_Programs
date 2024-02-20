public class ReverseString
{
    public static void main(String[] args) 
    {
        String str = "Meghana Rama Tulasi";
        //String Reversed = reverseString(str);
        System.out.println("Original String is : "+str);
        System.out.println("Reversed String is : "+reverseString(str));
    }
    public static String reverseString(String s)
    {
        char[] charArray = s.toCharArray();
        int l = charArray.length;

        for (int i=0;i<l/2;i++)
        {
            char temp = charArray[i];
            charArray[i] = charArray[l-i-1];
            charArray[l-i-1] = temp;
        }
        return new String(charArray);
    }
}