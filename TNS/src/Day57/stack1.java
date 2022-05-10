package Day57;

import java.util.Stack;

class stack1 {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        
        animals.pop();

        System.out.println("Stack: " + animals);
    }
}
