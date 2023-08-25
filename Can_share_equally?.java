import java.util.*;
public class Nis{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int x,y;
        x=n.nextInt();
        y=n.nextInt();
        if(x!=0 && x%2==0)
        {
            System.out.print("YES");
        }
        else if(x==0 && y%2==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}