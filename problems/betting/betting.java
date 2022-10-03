import java.util.Scanner;
public class betting{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        double out1 = 100.0/input;
        double out2 = 100.0/(100-input);
        System.out.printf("%f\n%f",out1,out2);
        scan.close();
    }
} 
