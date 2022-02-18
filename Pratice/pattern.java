import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of Row : ");
        int n = in.nextInt();
        System.out.print("Enter the value of Column : ");
        int m = in.nextInt();
        // outer
        for ( int i = 1; i<=n; i++ ){
            for ( int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
