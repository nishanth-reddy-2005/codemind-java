import java.util.*;
public class Puji{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b<c || b+c<a || a+c<b)
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