import java.util.Scanner;

public class Floydtriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = in.nextInt();
        int number = 1;

        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(number + " ");
                number++;

            }
            System.out.println();
            
        }
    }
}
