import java.util.Scanner;
public class heimavinna{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan = new Scanner(input);
        scan.useDelimiter(";");
        int sum = 0;
        while(scan.hasNext()){
            String parse = scan.next();
            if(!parse.contains("-")){
                ++sum;
            }
            else{
                int num1 = Integer.parseInt(parse.substring(0, parse.indexOf("-")));
                int num2 = Integer.parseInt(parse.substring(parse.indexOf("-")+1));
                sum += num2-num1+1;
            }
        }
        System.out.println(sum);
    }
} 
