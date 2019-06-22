public class checkchar {
    char a='a';
            void check()
            {
                if(a>='a' && a<='z')
                {
                    System.out.println("lower");
                }
                else
                {
                    System.out.println("upper");
                }
            }
    public static void main(String args[])
    {
        checkchar obj=new checkchar();
        obj.check();
    }
}
