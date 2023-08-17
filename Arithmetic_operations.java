import java.util.*;
public class Nis{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int a,b;
        a=n.nextInt();
        b=n.nextInt();
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Quotient:"+(a/b));
        System.out.print("Remainder:"+(a%b));
    }
}