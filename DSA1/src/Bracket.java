import java.util.Stack;
public class Bracket {
    Stack<Character> stack = new Stack<>();
    char current;
    char popedelement;
    public void match(char arr[]){
        for(int i = 0; i < arr.length; i++){
            current = arr[i];
            if(current == '{' || current == '[' || current =='('){
                stack.push(current);
                continue;
            }

            switch (current) {
                case ')':
                    popedelement = stack.pop();
                    if(popedelement == '{' || popedelement == '['){
                        System.out.println("False");
                        return;
                    }
                    break;
                case '}':
                    popedelement = stack.pop();
                    if(popedelement == '(' || popedelement == '['){
                        System.out.println("False");
                        return;
                    }
                    break;
                case ']':
                    popedelement = stack.pop();
                    if(popedelement == '{' || popedelement == '('){
                        System.out.println("False");
                        return;
                    }
                    break;
            }
        }
        System.out.println("True");

        
    }
    
}
