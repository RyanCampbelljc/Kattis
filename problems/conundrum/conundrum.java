import java.util.Scanner;
public class conundrum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int count = 0;
        boolean check = true;
        for(int i = 0; i < input.length(); ++i){
            if((i)%3==0){
                if(input.charAt(i) != 'P')
                    ++count;
            }

            else if(check){
                if(input.charAt(i) != 'E'){
                    ++count;
                }
                check = false;
            }
                
            else{
                if(input.charAt(i) != 'R'){
                    ++count;
                }
                check = true;
            }
        }


        System.out.println(count);
    }
} 
