import java.util.Stack;

public class Stacks {

    public static void main(String[] args){

        // stack = LIFO data structure (last in, first out)
        // stores objects into a sort of "vertical tower"
        // push() to add to the top
        // pop() to remove from the top
        // peek() to check an item
        // empty() to see if it's empty

        // uses of stacks
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("FIFA 26");
        stack.push("Doom");
        stack.push("Skyrim");

        for(int i = 0; i < 10000; i++){
            stack.push("Fallout");
        }

        System.out.println(stack);
        /* String myFavGame = stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();

        System.out.println(stack.empty());
        System.out.println(stack.search("Doom"));
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(myFavGame);
         */
    }
}
