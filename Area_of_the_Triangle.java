import java.util.*;
public class Nis{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        double a,b,c;
        double s,d;
        a=n.nextDouble();
        b=n.nextDouble();
        c=n.nextDouble();
        s=(a+b+c)/2;
        d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",d);
    }
}