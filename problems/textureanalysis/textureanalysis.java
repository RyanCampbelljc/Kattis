import java.util.Scanner;
public class textureanalysis{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.next();
        int lineNum = 1;
        while(!line.equals("END")){
            if(line.length()==1){
                System.out.println(lineNum + " EVEN");
                line = scan.next();
                ++lineNum;
                continue;
            }
            int[] arr = new int[line.length()];
            int count = 0;
            for(int i = 0; i< line.length(); ++i){
                if(line.charAt(i)=='*'){
                    arr[count] = i;
                    ++count;
                }
            }
            boolean check = true;
            int space = arr[1] - arr[0];
            for(int i = 1; i < count-1; ++i){
                if(arr[i+1] - arr[i] != space){
                    System.out.println(lineNum + " NOT EVEN");
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(lineNum + " EVEN");
            }
            ++lineNum;
            line = scan.next();
        }
    }
}
