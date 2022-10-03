import java.util.Scanner;
public class provincesandgold{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int g,s,c;
        g = scan.nextInt();
        s = scan.nextInt();
        c = scan.nextInt();
        int totalPoints = (g*3)+(s*2)+c;
        if(totalPoints>=8){
            System.out.print("Province or ");
            
        }
        else if(totalPoints>=5){
            System.out.print("Duchy or ");
            
        }
        else if(totalPoints>=2){
            System.out.print("Estate or ");
            
        }

        if(totalPoints>=6){
            System.out.println("Gold");
           
        }
        else if(totalPoints>=3){
            System.out.println("Silver");
           
        }
        else {
            System.out.println("Copper");
            
        }
    }
} 
