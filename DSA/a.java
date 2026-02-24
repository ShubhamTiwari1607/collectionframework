//given an pascal triangle and row number and column number find the value at that position in pascal triangle

package DSA;

import java.util.Scanner;

public class a {
    public static int nCr(int n ,int r){
        int res = 1;
        for(int i = 0 ; i < r; i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
    public static void main(String[] args){
        int row , col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column number");
        row = sc.nextInt();
        col = sc.nextInt();
        int ans = nCr(row , col);
        System.out.println(ans);

    }
}
