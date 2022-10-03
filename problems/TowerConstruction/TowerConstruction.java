import java.util.Scanner;
public class TowerConstruction{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        int temp = scan.nextInt();
        int count = 1;
        for(int i = 0; i < cycle-1; ++i){
            int num = scan.nextInt();
            if(num>temp)
                ++count;
            temp = num;
        }
        System.out.println(count);

    }
} 
