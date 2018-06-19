package Collections.Stack.task15;

import Collections.Stack.Stack;

public class StackForStringEquations {
    public static void main(String[]args){
        String stringToProcess = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        Stack<String> resultStack = new Stack<>();
        for (int i = 0; i < stringToProcess.length(); i++) {
            if (stringToProcess.charAt(i)=='+'){
                resultStack.push(String.valueOf(stringToProcess.charAt(++i)));
            }else if (stringToProcess.charAt(i)=='-'){
                System.out.print(resultStack.pop());

            }
        }
    }
}
