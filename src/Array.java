public class Array {
    int arr[]={5,6,3,5,7,8,9,1,2};
    int n=arr.length;
    public static void main(String args[])
    {
        Array a=new Array();
        Subarray s=new Subarray();
        s.displaylength(a.arr,a.n);
    }
}
class Subarray
{
    int len=1,max=1;
    void displaylength(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                len++;
            }
            else
            {
                if(max<len)
                {
                    max=len;
                }
                len=1;
            }
        }
        if(max<len)
        {
            max=len;
        }
     System.out.println(max);
    }
}
