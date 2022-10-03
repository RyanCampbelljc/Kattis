import java.util.Scanner;
public class grading{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int g = scan.nextInt();

        if(g>=a)
            System.out.println("A");
        else if(g>=b)
            System.out.println("B");
        else if(g>=c)
            System.out.println("C");
        else if(g>=d)
            System.out.println("D");
        else if(g>=e)
            System.out.println("E");
        else
            System.out.println("F");
        
    }
} 
