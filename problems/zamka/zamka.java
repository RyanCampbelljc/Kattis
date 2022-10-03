import java.util.Scanner;
public class zamka{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        int max = scan.nextInt();
        int num = scan.nextInt();
        int[] array = new int[max-min+1];
        int arrLocation = 0;

        for(int i = min; i<=max; ++i){
            if(addDigits(i) == num){
                array[arrLocation++] = i;
            }
        }
        int low = Integer.MAX_VALUE;
        int high = 0;
        for(int i = 0; i < arrLocation; ++i){
            if(array[i] > high)
                high = array[i];
            if(array[i]<low)
                low = array[i];
        }
        System.out.printf("%d\n%d",low,high);
    }

    public static int addDigits(int n){
        int sum = 0;
        while(n>0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }
} 
