import java.util.Scanner;
public class cetvrta{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = scan.nextInt();
        d = scan.nextInt();
        b = scan.nextInt();
        e = scan.nextInt();
        c = scan.nextInt();
        f = scan.nextInt();

        if(a==b)
            System.out.print(c);
        else if(a==c)
            System.out.print(b);
        else
            System.out.print(a);

        if(d==e)
            System.out.print(" " + f);
        else if(d==f)
            System.out.print(" " + e);
        else
            System.out.print(" " + d);
    }
} 
