import java.util.Scanner;
public class helpaphd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        for(int i = 0; i < cycle; ++i){
            String string = scan.next();
            if(string.charAt(0) == 'P'){
                System.out.println("skipped");
                continue;
            }
            int int1 = Integer.parseInt(string.substring(0,string.indexOf("+")));
            int int2 = Integer.parseInt(string.substring(string.indexOf("+")+1));
            System.out.println(int1+int2);
        }
    }
}
