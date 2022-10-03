import java.util.Scanner;
public class relocation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numCompanys = scan.nextInt();
        int numRequests = scan.nextInt();
        int[] companyarray = new int[numCompanys];
        for(int i = 0; i < numCompanys; ++i){
            companyarray[i] = scan.nextInt();
        }
        for(int i = 0; i < numRequests; ++i){
            int requestType = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();

            if(requestType == 1){
                companyarray[a-1] = b;
            }
            else{
                int anwser = Math.abs(companyarray[b-1] - companyarray[a-1]);
                System.out.println(anwser);
            }
        }
    }
}
