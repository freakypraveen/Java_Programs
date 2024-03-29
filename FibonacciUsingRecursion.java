import java.util.*;

public class FibonacciUsingRecursion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}