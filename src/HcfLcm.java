import java.util.Scanner;
public class HcfLcm
{
    public static void main(String args[])
    {
        int x,y,hcf=012,a;
        Scanner scan=new Scanner(System.in);
        x=scan.nextInt();
        y=scan.nextInt();
        for(int i = 1;i <= x ||i <= y;i++) {
            if( x%i == 0 && y%i == 0 )
            {
                hcf = i;
            }
        }

        System.out.println("HCF of given two numbers is "+hcf);

        a = (x*y)/hcf;

        System.out.println("LCM of given two numbers is "+a);
    }
}
