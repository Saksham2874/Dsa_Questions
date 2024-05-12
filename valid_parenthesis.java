import java.util.Stack;

public class valid_parenthesis {
    class Solution {
        public boolean isValid(String s) {
            int n = s.length();
            Stack<Character> a = new Stack<Character>();
            for(int i = 0 ; i<n ; i++){
                char ch = s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='['){
                    a.push(ch);
                }
                else if(ch==')' || ch=='}' || ch==']'){
                    if(a.isEmpty()){
                        return false;
                    }
                    char top = a.pop();
                    if( (ch==')' && top!='(' ) || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                        return false;
                    }
                }
            }
            return a.isEmpty();

        }
    }
}
