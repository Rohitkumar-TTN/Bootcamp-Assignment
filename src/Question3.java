import java.util.Stack;


 class SpecialStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }


    public int pop() {
        int popped = mainStack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }



    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }



    public boolean isEmpty() {
        return mainStack.isEmpty();
    }




    public boolean isFull(int capacity) {
        return mainStack.size() == capacity;
    }


    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();
        stack.push(10);
        stack.push(20);
        stack.push(5);
        stack.push(15);


        System.out.println("Current Min: " + stack.getMin());
        stack.pop();
        System.out.println("Current Min: " + stack.getMin());
        stack.pop();
        System.out.println("Current Min: " + stack.getMin());
    }
}
