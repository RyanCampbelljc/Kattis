import java.util.Scanner;
public class ultimatebinarywatch{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String tens = "";
        String ones = "";
        String mTens = "";
        String mOnes = "";
        String input = scan.next();

        tens = create(input.charAt(0));
        ones = create(input.charAt(1));
        mTens = create(input.charAt(2));
        mOnes = create(input.charAt(3));
        
        for(int i = 0; i <4; ++i){
            System.out.printf("%c %c   %c %c\n",tens.charAt(i) == '1'?'*':'.',ones.charAt(i) == '1'?'*':'.',mTens.charAt(i) == '1'?'*':'.',mOnes.charAt(i) == '1'?'*':'.');
        }
    }

    public static String create(char c){
        String s = "";
        if(c == '1')
            s+="0001";
        else if(c == '2')
            s+="0010";
        else if(c == '3')
            s+="0011";
        else if(c == '4')
            s+="0100";
        else if(c == '5')
            s+="0101";
        else if(c == '6')
            s+="0110";
        else if(c == '7')
            s+="0111";
        else if(c == '8')
            s+="1000";
        else if(c == '9')
            s+="1001";
        else if(c == '0')
            s+="0000";
        
        return s;
    }

} 
