import java.util.Scanner;
public class reversebinary{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] arr = toBinary(input);
        
        int power = 0;
        int total = 0;
        int index = 0;
        for(int i = arr.length-1; i >= 0; --i){
            if(arr[i] == 1){
                index = i;
                break;
            }
        }
        for(int i = index; i >= 0; --i){
            if(arr[i] == 1){
                total += Math.pow(2,power);
            }
            ++power;
        }
        
        
        System.out.println(total);
    }

    public static int[] toBinary(int num){
        int[] arr = new int[(int)(Math.log(num)/Math.log(2))+1];
        int count = 0;
        while(num>0){
            arr[count++] = num%2;
            num = num/2;
        }
        return arr;
    }
}