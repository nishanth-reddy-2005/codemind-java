import java.util.*;
public class Puji{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        {
            int t;
            t=n.nextInt();
            while(t!=0)
            {
                int a=n.nextInt();
                int b=n.nextInt();
                if(a<=b/2 || a==b)
                {
                    System.out.print("YES
");
                }
                else
                {
                    System.out.print("NO
");
                }
                t-=1;
            }
        }
    }
}