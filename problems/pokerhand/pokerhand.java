import java.util.Scanner;
import java.util.HashMap;
public class pokerhand{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //A23456789TJQK
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < 5; ++i){
            String input = scan.next();
            int val = map.getOrDefault(input.charAt(0),0) + 1;
            map.put(input.charAt(0), val);
        }
        int max = 0;
        for (int val : map.values()) {
            if(val>max)
                max = val;
        }
        System.out.println(max);

    }
} 