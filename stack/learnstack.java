package stack;
import java.util.Stack;
public class learnstack {
    
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        System.out.println(stack);
        stack.pop(); // Removes the top element ("Java") from the stack
        System.out.println(stack);
        System.out.println(stack.peek()); // Returns the top element ("World") without removing it
        System.out.println(stack.isEmpty()); // Checks if the stack is empty
        System.out.println(stack.size()); // Returns the number of elements in the stack    


    }

}
