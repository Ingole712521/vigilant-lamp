import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args) {
    int inputs[] = new int[] { 6, 1, 2, 3, 4, 9, 8};
    int numbers = inputs.length;
    int s = village1(inputs, numbers);
    System.out.println(s);
    }
    
    public static int village1(int ar[], int p) {
        int ss;
        for (int h = 0; h < p - 1; h++) {
            for (int d = h + 1; d < p; d++) {
                if (ar[h] > ar[d]) {
                    ss = ar[d];
                    ar[d] = ar[h];
                    ar[h] = ss;
                }
            }
        }
        int big = 0;
        int sum[] = new int[100];
        int f = 0;
        int temp;
        for (int i = 0; i < p - 2; i++) {
            p: for (int k = i + 1; k < p; k++) {
                if (!(ar[k] % ar[i] == 0)) {
                    continue p;
                } else {
                    sum[f] = ar[i] + ar[k];
                    temp = ar[k];
                }
                if (ar[k] != ar[p - 1]) {
                    for (int j = k + 1; j < p; j++) {
                        if (ar[j] % temp == 0) {
                            sum[f] = sum[f] + ar[j];
                            temp = ar[j];
                        }
                    }
                }
                f++;
            }
        }
        big = sum[0];
        for (int u = 1; u < sum.length; u++) {
            if (big < sum[u]) {
                big = sum[u];
            }
        }
        return big;
    }
    }