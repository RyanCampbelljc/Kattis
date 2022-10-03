import java.util.Scanner;
public class tspelling{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//"4\nhi\nyes\nfoo  bar\nhello world"
        String finalString = "";
        int cycle = scan.nextInt();
        scan.nextLine();//garbage
        int last = 0;
        for(int j = 0; j < cycle; ++j){
            String input = scan.nextLine();
            for(int i = 0; i < input.length(); ++i){
                int x = number(input.charAt(i));
                if(i>0){
                    if(last%10 == x%10){
                        finalString += " ";
                    }

                }
                finalString += Integer.toString(x);
                last = x;
            }

            System.out.println("Case #" + (j+1) + ": " + finalString);
            finalString = "";
        }
        
    }
    public static int number(char c){
                switch(c) {
                case 'a':
                    return 2;
                    
                case 'b':
                    return 22;
                    
                case 'c':
                    return 222;
                    
                case 'd':
                    return 3;
                    
                case 'e':
                    return 33;
                    
                case 'f':
                    return 333;
                    
                case 'g':
                    return 4;
                    
                case 'h':
                    return 44;
                    
                case 'i':
                    return 444;
                    
                case 'j':
                    return 5;
                    
                case 'k':
                    return 55;
                    
                case 'l':
                    return 555;
                    
                case 'm':
                    return 6;
                    
                case 'n':
                    return 66;
                    
                case 'o':
                    return 666;
                    
                case 'p':
                    return 7;
                    
                case 'q':
                    return 77;
                    
                case 'r':
                    return 777;
                    
                case 's':
                    return 7777;
                    
                case 't':
                    return 8;
                    
                case 'u':
                    return 88;
                    
                case 'v':
                    return 888;
                    
                case 'w':
                    return 9;
                    
                case 'x':
                    return 99;
                    
                case 'y':
                    return 999;
                    
                case 'z':
                    return 9999;
                    
                case ' ':
                    return 0;
                
                }
                return 0;
    }

}
