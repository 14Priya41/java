import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int r,count=0;
        int arm=0;
        int num=n;
        while(n>0)
        {
            r=n%10;
            count++;
            n=n/10;
        }
        int orig=num;
        while(num>0)
        {
            r=num%10;
            arm=arm+(int)(Math.pow(r,count));
            num=num/10;
        }
        if(orig==arm)
        {
            System.out.println("This is armstrong");
        }
        else
        {
            System.out.println("This is not armstrong");
        }

    }

}
