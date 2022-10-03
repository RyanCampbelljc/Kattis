import java.util.Scanner;
public class fiftyshades{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        int count = 0;
        for(int i = 0; i < cycle; ++i){
            String input = scan.next();
            if(containsPink(input)){
                ++count;
                continue;
            }
            if(containsRose(input)){
                ++count;
                continue;
            }
        }
        if(count == 0){
            System.out.println("I must watch Star Wars with my daughter");
        }
        else{
            System.out.println(count);
        }

    }

    public static boolean containsPink(String s){
        for(int i = 0; i < s.length()-3; ++i){
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p'){
                if(s.charAt(i+1) == 'I' || s.charAt(i+1) == 'i'){
                    if(s.charAt(i+2) == 'N' || s.charAt(i+2) == 'n'){
                        if(s.charAt(i+3) == 'K' || s.charAt(i+3) == 'k'){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static boolean containsRose(String s){
        for(int i = 0; i < s.length()-3; ++i){
            if(s.charAt(i) == 'R' || s.charAt(i) == 'r'){
                if(s.charAt(i+1) == 'O' || s.charAt(i+1) == 'o'){
                    if(s.charAt(i+2) == 'S' || s.charAt(i+2) == 's'){
                        if(s.charAt(i+3) == 'E' || s.charAt(i+3) == 'e'){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
} 
