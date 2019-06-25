import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r, rev = 0;
        int num = n;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse is:" + rev);
    }
}
