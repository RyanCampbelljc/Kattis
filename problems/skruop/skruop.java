import java.util.Scanner;
public class skruop{
    public static void main(String[] args){
        //String x = "5\nSkru op!\nSkru op!\nSkru op!\nSkru op!\nSkru ned!";
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        int count = 7;
        scan.nextLine();
        for(int i = 0; i < cycle; ++i){
            String line = scan.nextLine();
            if(line.equals("Skru op!")){
                if(count<10){
                    ++count;
                }
            }
            else{
                if(count>0){
                    count--;
                }
            }
        }
        System.out.println(count);
    }
} 
