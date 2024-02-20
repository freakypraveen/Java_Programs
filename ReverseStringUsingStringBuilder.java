public class ReverseStringUsingStringBuilder {
    public static void main(String args[])
    {
        String str = "praveen";
        System.out.println("Original String is : "+str);
        StringBuilder s = new StringBuilder(str);
        System.out.println("Reversed String is : "+s.reverse());
    }
}
