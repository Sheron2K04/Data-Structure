package dsa;

public class StackApp {

	public static void main(String[] args) {
		BoundedArrayStack theStack = new BoundedArrayStack(5); //create a stack with max size 10
		
		//push operation
		for(int i=1; i<=6; i++) {
			if(!theStack.isFull()) {
				//insert items
				theStack.push(i * 10);
			}else {
				System.out.println("Cannot push. Stack is full");
			}
		}
		
		theStack.print();
		
		//peek the top element
        if (!theStack.isEmpty()) {
            System.out.println("Top element is: " + theStack.peek());
        } else {
            System.out.println("Stack is empty, nothing to peek");
        }
        
		//pop operation
		if(!theStack.isEmpty()) {
			while(!theStack.isEmpty()) {
				//until the stack is empty, delete items from stack
				int val = theStack.pop();
				System.out.print(val);
				System.out.print(" ");
			}	
		}else {
			System.out.println("Cannot pop. Stack is empty");
		}

	}

}