package largeststack;

/**
 * The MainApplication class describes
 * the class with the main method
 * of the application
 * @author Waswa Olunga
 */
public class MainApplication {

	public static void main(String[] args) {

		MaxStack maxStack = new MaxStack();

		/*maxStack.addToStack(1);
		maxStack.addToStack(2);
		maxStack.addToStack(3);
		maxStack.addToStack(4);

		System.out.println(maxStack.getMax());*/

		/*maxStack.addToStack(4);
		maxStack.addToStack(3);
		maxStack.addToStack(2);
		maxStack.addToStack(1);

		System.out.println(maxStack.getMax());*/

		/*maxStack.addToStack(1);
		System.out.println(maxStack.getMax());
		maxStack.addToStack(2);
		System.out.println(maxStack.getMax());
		maxStack.addToStack(3);
		System.out.println(maxStack.getMax());
		maxStack.addToStack(4);
		System.out.println(maxStack.getMax());*/

		maxStack.addToStack(1);
		maxStack.addToStack(2);
		maxStack.addToStack(3);
		maxStack.addToStack(4);

		maxStack.removeTopOfStack();
		System.out.println(maxStack.getMax());
		maxStack.removeTopOfStack();
		System.out.println(maxStack.getMax());
		maxStack.removeTopOfStack();
		System.out.println(maxStack.getMax());
		
	}

}
