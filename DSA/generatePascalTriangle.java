package DSA;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class generatePascalTriangle {
    public static void main(String [] args){
        List<List<Integer>> res = new ArrayList<>();
        System.out.println("Enter the number of rows in the pascal triangle");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        for( int row = 1 ; row <= rows ; row++){
            List<Integer> temp = new ArrayList<>();
            int ans  = 1;
            for(int col = 1 ; col <= row ; col++ ){
                temp.add(ans);
                ans *= row-col;
                ans /= col;
            }
            res.add(temp);       
        }
        System.out.println(res);
    }
}
