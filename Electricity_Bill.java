import java.util.*;
public class Nis{
    public static void main(String[] args)
    {
        Scanner b=new Scanner(System.in);
        String a,c;
        int n;
        double ta=0;
        a=b.nextLine();
        c=b.nextLine();
        n=b.nextInt();
        if(n<=199)
        {
            ta=n*1.20;
        }
        else if(n>=200 && n<400)
        {
            ta=n*1.50;
        }
        else if(n>=400 && n<600)
        {
            ta=n*1.80;
        }
        else if(n>600)
        {
            ta=n*2.00;
        }
        if(ta>=400)
        {
            double suc=ta*0.15;
            ta=ta+suc;
        }
        else if(ta<400)
        {
            ta+=100;
        }
        System.out.printf("%.2f",ta);
        b.close();
    }
}