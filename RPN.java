import java.io.*;
import java.util.*;

class RPN{
    public static void main(String[] args) throws Exception{
        File inputFile = new File("input.txt");
        Scanner inputReader = new Scanner(inputFile);
        Stack<String> stack = new Stack<String>();

        while (inputReader.hasNextLine()) {
            String inputText = inputReader.nextLine().strip();
            
            if (inputText.equals("+") || inputText.equals("-") || inputText.equals("*") || inputText.equals("/")){
              int value1 = Integer.parseInt(stack.pop());
              int value0 = Integer.parseInt(stack.pop());
              
              if (inputText.equals("+")) {
                stack.push(String.valueOf(value0 + value1));
              }

              else if (inputText.equals("-")) {
                stack.push(String.valueOf(value0 - value1));
              }

              else if (inputText.equals("*")) {
                stack.push(String.valueOf(value0 * value1));
              }

              else if (inputText.equals("/")) {
                stack.push(String.valueOf(value0 / value1));
              }
            }

            else {
              stack.push(inputText);
            }
        }

        System.out.println(stack.pop());
    }
}