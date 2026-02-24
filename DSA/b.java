//print any row of a pascal triangle

package DSA;

import java.util.Scanner;

public class b {
    
    public static void helper(int row){
        int ans = 1;
        for(int i = 1; i <= row; i++){
            System.out.print(ans+" ");
            ans = ans*(row-i);
            ans =  ans/i;
        }
       
    }
   
    
    public static  void main(String[] args){
        int row ;
        System.out.println("enter the row number");
        Scanner sc = new Scanner(System.in) ;
        row = sc.nextInt();
        sc.close();
        helper(row);
        
    }
}
 
