import java.util.Scanner;
public class Primenum {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int flag=0;
            for(int j=2;j<=n/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}
