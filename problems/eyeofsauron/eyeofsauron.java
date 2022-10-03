import java.util.Scanner;
public class eyeofsauron{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if(input.length()%2==0 && input.charAt(input.length()/2) == ')')
            System.out.println("correct");
        else
            System.out.println("fix");
        
    }
}
