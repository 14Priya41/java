import java.util.Random;
public class Randomnumbers
{
    public static void main(String[] args) {
        int min=1;
        int max=100;
        Random r = new Random();
        int rnum=min+r.nextInt(max);
        System.out.println(rnum);
    }

}
