
package Solution;

import java.util.Stack;


public class main {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));

    }
    
    public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char character : s.toCharArray()) {
            if(character == '(' || character == '[' || character == '{'){
                stack.push(character);
            }else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((character == ')' && top != '(') || (character == ']' && top != '[') || (character == '}' && top != '{')){
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
    
}
