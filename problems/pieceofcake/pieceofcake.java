import java.util.Scanner;
public class pieceofcake{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int v = scan.nextInt();

        int big = Math.max(n-h,h);
        int otherBig = Math.max(n-v,v);
        System.out.print(big*otherBig*4);
    }
} 
