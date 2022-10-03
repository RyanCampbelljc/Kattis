import java.util.Scanner;
public class problems99{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num<=99){
            System.out.println("99");
        }
        else{
            int remainder = num%100;
            if(remainder>=49){
                num += (99-remainder);
            }
            else{
                num -= (remainder+1);
            }
            System.out.println(num);
        }
    }
} 
 
