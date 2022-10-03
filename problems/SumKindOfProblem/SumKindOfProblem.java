import java.util.Scanner;

public class SumKindOfProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cycle = scan.nextInt();
        for (int i = 0; i < cycle; i++) {
            int k = scan.nextInt();
            int num = scan.nextInt();
            int s1 = 0;
            int s2 = 0;
            int s3 = 0;
            int j;
            for (j = 1; j <= num; j++) {
                s1 += j;
            }

            int count = 0;
            for (j = 1; count < num; j += 2, count++) {
                s2 += j;
            }

            count = 0;
            for (j = 2; count < num; j += 2, count++) {
                s3 += j;
            }
            System.out.println(k + " " + s1 + " " + s2 + " " + s3);
        }
    }
}
