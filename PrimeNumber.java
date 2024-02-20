import java.util.*;

public class PrimeNumber 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n==1)
        {
            System.out.println("Please enter number greater than 1");
        }
        else{
            for (int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(n+" is not a prime Number");
            }
            else{
                System.out.println(n+" is a prime number");
            }
        }

    }
}
