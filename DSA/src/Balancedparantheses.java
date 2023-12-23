import java.util.Stack;
public class Balancedparantheses {

    public void checkBalanced(char [] paraList){
        Stack<Character> stack= new Stack<>();
        char curr;

        for(int i = 0; i < paraList.length; i++){
            curr = paraList[i];

            if(curr == '{' || curr == '[' || curr == '('){
                stack.push(curr);
                continue;

            }

            
            char paraPop;
            switch (curr) {
                case '}':
                    paraPop = (char)stack.pop();
                    if(paraPop == '[' || paraPop == '('){
                        System.out.println("unbalanced");
                        return;
                    }
                    break;
                case ']':
                    paraPop = (char)stack.pop();
                    if(paraPop == '{' || paraPop == '('){
                        System.out.println("unbalanced");
                        return;
                    }
                    break;
                case ')':
                    paraPop = (char)stack.pop();
                    if(paraPop == '[' || paraPop == '{'){
                        System.out.println("unbalanced");
                        return;
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println("balanced");


    }
    
}
