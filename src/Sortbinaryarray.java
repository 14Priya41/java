import java.util.Scanner;
public class Sortbinaryarray {
    public static void main(String args[])
    {
        int arr[]=new int[6];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++)
        {
            arr[i]=1;
        }
        System.out.println("Sorted array is:");
        for(int v:arr)
        {
            System.out.println(v);
        }
    }
}
