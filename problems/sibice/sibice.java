import java.util.Scanner;
public class sibice{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = Math.sqrt(a*a+b*b);
        for(int i = 0; i < cycle; ++i){
            int temp = scan.nextInt();
            if(temp <= c){
                System.out.println("DA");
            }
            else 
                System.out.println("NE");
        }
    }
} 
