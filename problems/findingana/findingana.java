import java.util.Scanner;
public class findingana{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        for(int i = 0; i < input.length(); ++i){
            if(input.charAt(i) == 'a'){
                String out = input.substring(i);
                System.out.println(out);
                break;
            }
        }
    }
} 
