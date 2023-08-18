import java.util.*;
public class Puji{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        int t;
        t=n.nextInt();
        while(t!=0)
        {
            int a=n.nextInt();
            int b=n.nextInt();
            int c=a/b+(a%b);
            System.out.printf("%d
",c);
            t-=1;
        }
    }
}