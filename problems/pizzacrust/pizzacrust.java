import java.util.Scanner;
public class pizzacrust{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double r = scan.nextInt();
        double c= scan.nextInt();
        double cheese = Math.PI * (r-c) * (r-c);
        double whole = Math.PI * r * r;
        double fraction = (cheese/whole)*100.0;
        System.out.println(fraction);
    }
} 
