package Pratice.functionandMethod;
import java.util.*;

public class questiononloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = in.nextInt();
        System.out.print("Enter the value of m :");
        int m = in.nextInt();
        System.out.print("Enter the value of q :");
        int q = in.nextInt();
/*
        int max =n ;
        if (m>max){
            max = m;
        }
        if (q>max){
            max = q;
        }
       System.out.println(max);
       */
      int max = n;
      if (n>m){
          max = m;
      }
      else {
          max = q;
      }
      System.out.println(max);;
    }
    
}
