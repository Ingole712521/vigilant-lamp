package pattern;
public class advanced {
    public static void main(String[] args) {
            int n = 5;
// upper half 
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
             int space = 2 *(n-i);
             for (int j = 1; j <=space; j++) {
                 System.out.print(" ");
                 
             }
             for (int j = 1; j <=i; j++) {
                 System.out.print("*");
                 
             }
             System.out.println();
        }
        //lowerhalf 
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
             int space = 2 *(n-i);
             for (int j = 1; j <=space; j++) {
                 System.out.print(" ");
                 
             }
             for (int j = 1; j <=i; j++) {
                 System.out.print("*");
                 
             }
             System.out.println();

    }
    
}
}
