public class StringContainsVowels 
{
    public static void main(String args[])
    {
        String str = "tv";
        System.out.println(str.toLowerCase().matches(".*[aeiou].*"));

    }
}
