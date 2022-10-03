import java.util.Scanner;
import java.util.Arrays;

public class OddGnome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cycle = scan.nextInt();
        for (int i = 0; i < cycle; i++) {
            int innercycle = scan.nextInt();
            int[] array = new int[innercycle];
            for (int k = 0; k < innercycle; k++) {
                array[k] = scan.nextInt();
            }

            for (int j = 1; j < array.length; j++) {
                if (array[j] != array[j - 1] + 1) {
                    if (j == 1) {
                        if (array[0] + 1 == array[2]) {
                            System.out.println("2");
                        } else {
                            System.out.println("1");
                        }
                    }

                    else if (j == array.length) {
                        System.out.println(array.length);
                    }

                    else {
                        System.out.println(j + 1);
                    }
                    break;
                }

            }
        }

    }
}
