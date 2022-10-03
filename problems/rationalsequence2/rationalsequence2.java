import java.util.Scanner;
public class rationalsequence2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//"4\n1 1/1\n2 1/3\n3 1/5\n4 2178309/1346269"
        int cycle = scan.nextInt();
        for(int i = 0; i < cycle; ++i){
            int k = scan.nextInt();
            String input = scan.nextLine();
            int numerator = Integer.parseInt(input.substring(1,input.indexOf('/')));
            int denom = Integer.parseInt(input.substring(input.indexOf('/')+1));

            String x = counter(numerator, denom);
            int height = Integer.parseInt(x.substring(0,x.indexOf(' ')));
            int sum = Integer.parseInt(x.substring(x.indexOf(' ')+1));
            int n = (int)(Math.pow(2,height)-1)+sum;
            System.out.println(k + " " + n);
        }
    }

    public static String counter(int num, int denom){
        String x = "";
        int height = 0;
        int sum = 1; // the number of nodes to the left
        while(num != 1 || denom != 1){
            ++height;
            if(num>denom){//right branch
                sum += Math.pow(2,height-1);
                num = num- denom;
            }
            else{//left branch
                denom = denom - num;
            }

        }
        return x += height + " " + sum;
    }
}
/**
 * 2^(left + right-1) = all the nodes above yours
 * 
 */