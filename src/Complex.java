import java.util.Scanner;
public class Complex {
    int real;
    int imaginary;
    Complex(int r1, int i1)
    {
        this();//constructor chaining
        this.real=r1;//this points to instance variables of current class
        this.imaginary=i1;
        System.out.println(real+"+"+imaginary+"i");
    }
    Complex()
    {
          System.out.println("The complex number is:");
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int r1 = scan.nextInt();
        int i1 = scan.nextInt();
        Complex cp1 = new Complex(r1,i1);
        System.out.println("Enter second number:");
        int r2 = scan.nextInt();
        int i2 = scan.nextInt();
        Complex cp2 = new Complex(r2,i2);
        add(cp1,cp2);//call static methods
        subtract(cp1,cp2);
    }
    static void add(Complex cp1,Complex cp2)
    {
        int realpart=cp1.real+cp2.real;
        int imagpart=cp1.imaginary+cp2.imaginary;
        System.out.println("The added complex number is:"+realpart+"+"+imagpart+"i");
    }
    static void subtract(Complex cp1,Complex cp2)
    {
        int realpart=cp1.real-cp2.real;
        int imagpart=cp1.imaginary-cp2.imaginary;
        System.out.println("The subtracted complex number is:"+realpart+"+"+imagpart+"i");
    }

}
