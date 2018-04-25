package largeststack;

import java.util.Stack;

/**
 * The MaxStack class
 * describes a class that
 * deals with storing data
 * in a stack and getting the
 * maximum value in that stack
 *
 * Time complexity: O(1)
 * Space complexity: O(m) where
 * m is the number of operations
 * performed on maxValuesStack
 *
 * @author Waswa Olunga
 */

public class MaxStack {

	private int max;
	private Stack<Integer> maxValuesStack;
	private Stack<Integer> stack;

	public MaxStack() {
		max = Integer.MIN_VALUE;
		maxValuesStack = new Stack<>();
		stack = new Stack<>();
	}

	public int getMax() {
		assert !stack.isEmpty(): "Cannot get maximum from an empty stack";
		return max;
	}

	public void addToStack(int value){
		stack.add(value);
		updateStack();
	}

	private void updateStack(){

		int top = stack.peek();

		if (top > max){

			addToMaxStackValues();
			max = top;

		}
	}

	private void addToMaxStackValues() {

		if (max != Integer.MIN_VALUE) {
			maxValuesStack.add(max);
		}
	}

	public void removeTopOfStack(){

		assert !stack.isEmpty(): "Cannot remove values from an empty stack";

		if (stack.peek() == max){
			max = getOldMaximum();
		}

		stack.pop();
	}

	private Integer getOldMaximum() {
		assert !maxValuesStack.isEmpty(): "Cannot get maximum from an empty stack";
		return maxValuesStack.pop();
	}

}