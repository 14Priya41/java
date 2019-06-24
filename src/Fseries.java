import java.util.Scanner;
public class Fseries {
    void fab(int n)
    {
        int n1=0,nextterm;
        int n2=1;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                System.out.println(n1);

            }
            else {
                if (i == 1) {
                    System.out.println(n2);

                } else {
                    nextterm = n1 + n2;
                    n1 = n2;
                    n2 = nextterm;
                    System.out.println(nextterm);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        Fseries f=new Fseries();
        System.out.println("F-seies is :");
        f.fab(n);
    }
}
