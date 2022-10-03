import java.net.http.HttpRequest.BodyPublishers;
import java.util.Scanner;
public class fishmongers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numFish = scan.nextInt();
        int numBuyers  =scan.nextInt();
        int[] weight = new int[numFish];
        for(int i = 0; i <numFish; ++i){
            weight[i] = scan.nextInt();
        }
        int[] buyerArray = new int[numBuyers*2];
        for(int i = 0; i < numBuyers*2; ++i){
            buyerArray[i] = scan.nextInt();
        }


        int sum = 0;
        // first loop find max in weight array;
        //then loop through buyer array and find who willing 
        //to pay most per kilogram.
        while(true){
            int max = 0;//max weight to sell
            int index = 0;
            




            int maxBuyerWillingToPay = 0;//max weight to sell
            int numFishMaxBuyerWants = 0;
            index = 0;
            for(int i = 1; i < numBuyers*2; i+=2){
                if(buyerArray[i]>maxBuyerWillingToPay){
                    maxBuyerWillingToPay = buyerArray[i];
                    numFishMaxBuyerWants = buyerArray[i-1];
                    index = i;
                }
            }
            buyerArray[index] = 0;
            buyerArray[index-1] = 0;


            
            for(int i = 0; i < numFishMaxBuyerWants; ++i){
                if(numFish<=0){
                    break;
                }
                sum += maxBuyerWillingToPay * max;

            }
            if(numFish<=0){
                break;
            }
        }
    }


    public int maxWeightToSell(){
        for(int i = 0; i < numFish; ++i){
            if(weight[i] > max){
                max = weight[i];
                index = i;
            }
        }
        if(max == 0)
            break;
        weight[index] = 0;
    }
}
