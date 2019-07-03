public class CountInString {
    public static void main(String args[])
    {
        String s="abc12@3defio8";
        int vowels=0,consonants=0,numbers=0,specialsymbol=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else if(ch >= 'a'&& ch <= 'z')
            {
                consonants++;
            }
            else if(ch >= '0' && ch <= '9')
            {
                numbers++;
            }
            else
            {
                specialsymbol++;
            }
        }
        System.out.println("vowels are:"+vowels);
        System.out.println("consonants are:"+consonants);
        System.out.println("numbers are:"+numbers);
        System.out.println("specialsymbol are:"+specialsymbol);
    }
}
