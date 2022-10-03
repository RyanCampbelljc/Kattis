import java.util.Scanner;
public class speeding{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        int[] arrt = new int[cycle];
        int[] arrd = new int[cycle];
        for(int i = 0; i < cycle; ++i){
            arrt[i] = scan.nextInt();
            arrd[i] = scan.nextInt();
        }
        int max = 0;
        int velocity = 0;
        for(int i = 0; i < cycle-1; ++i){
            velocity = (arrd[i+1] - arrd[i]) / (arrt[i+1] - arrt[i]);
            if(velocity>max){
                max = velocity;
            }
        }
        System.out.println(max);

    }
} 
