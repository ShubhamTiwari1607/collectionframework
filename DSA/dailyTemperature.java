package DSA;

import java.util.*;

public class dailyTemperature {
        public static int[] dailyTemperatures(int[] temperatures) {
            
            Stack<Integer> st = new Stack<>();
            int[] ans = new int[temperatures.length];
            
            for (int i = 0; i < temperatures.length; i++) {
                
                while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                    int index = st.pop();
                    ans[index] = i - index;
                }
                
                st.push(i);
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
            int[] result = dailyTemperature.dailyTemperatures(temperatures);
            System.out.println(Arrays.toString(result));
        }
}
