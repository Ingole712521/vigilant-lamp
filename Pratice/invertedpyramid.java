import java.util.Scanner;

public class invertedpyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = in.nextInt();

        for (int i = n; i>= 1 ; i--) {
            for (int j = 1; j <= i  ; j++) {
                System.out.print("*");


            }
            System.out.println();

        }
    }
}
