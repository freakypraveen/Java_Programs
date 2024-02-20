public class SwapTwoNumbers 
{
    public static void main(String args[])
    {
        int a = 9;
        int b = 4;
        System.out.println("Before Swapping : "+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swapping : "+a+" "+b);
    }   
}
