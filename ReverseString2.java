public class ReverseString2 
{	public static void main(String[] args) 
    {
		String str = "praveen";
        char[] c = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i = c.length-1;i>=0;i--)
        {
            s.append(c[i]);
        }
        System.out.println("Reversed String is : "+s);
	}

}
