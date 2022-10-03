import java.util.Scanner;
public class candyDivision{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long candies = scan.nextLong();
        long[] arr = new long[(int)Math.sqrt(candies)];
        int counter = 0;
        for (long i = 1; i <= Math.sqrt(candies); ++i) {
            if (candies % i == 0) {
                if(candies/i == i)
                    System.out.print((i-1) + " ");
                else{
                    System.out.print((i-1) + " ");
                    arr[counter++] = (candies/i) - 1;
                }
            }
        }
        for(int i = counter -1; i>=0; --i){
            System.out.print(arr[i] + " ");
        }
        
    }
} 
