import java.util.*;

class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n)
    {
        // your code here
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<n; i++){
            if(stack.empty() || arr[i] <= stack.peek()) {
                stack.push(arr[i]);
            }
            else {
                stack.push(stack.peek());
            }
        }
        
        return stack;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        if(s.size() > 0){
            while(!s.empty()){
            int num = s.peek();
            System.out.print(num + " ");
            s.pop();
            }
        }
        
    }
}