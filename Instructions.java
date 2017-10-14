package aed.stackmachine;

import aed.lifo.*;

/**
 * Implements the instructions of the virtual machine, i.e., <code>load</code>,
 * <code>neg</code>, <code>add</code>, <code>div</code>, <code>power</code>,
 * <code>drop</code>, <code>dup</code>, and <code>swap</swap>.
 */
public class Instructions {

	/**
	 * Implements the <code>load</code> instruction that loads a value on top of
	 * the stack.
	 */
	static public class Load implements Instruction {
		private int value;

		public Load(int value) {
			this.value = value;
		}

		/**
		 * Executes the <code>load</code> instruction.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc {
			stack.push(value);
		}

		public String toString() {
			return "load(" + value + ")";
		}
	}

	/**
	 * Implements the <code>neg</code> instruction that replaces the top element
	 * of the stack with its negation. For example, if the stack is
	 * <code><3 ...></code> the result of executing the <code>neg</code>
	 * instruction is the stack <code><-3 ...></code>.
	 */
	static public class Neg implements Instruction {

		/**
		 * Executes the <code>neg</code> instruction.
		 * 
		 * @throws StackUnderFlowExc
		 *             if the stack is empty.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc {
			if (stack.isEmpty()) {
				throw new StackUnderFlowExc();
			} else {
				int valor = -stack.top();
				stack.pop();
				stack.push(valor);
			}
		}

		public String toString() {
			return "neg";
		}
	}

	/**
	 * Implements the <code>add</code> instruction that replaces the top two
	 * elements of the stack with their sum. For example, if the stack is
	 * <code><3 7 ...></code> the result of executing the <code>neg</code>
	 * instruction is the stack <code><10 ...></code>.
	 */
	static public class Add implements Instruction {

		/**
		 * Executes the <code>add</code> instruction.
		 * 
		 * @throws StackUnderFlowExc
		 *             if the stack is empty.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc {
			if (stack.size() < 2) {
				throw new StackUnderFlowExc();
			} else {
				int valor = stack.top();
				stack.pop();
				int valor1 = stack.top()+valor;
				stack.pop();
				stack.push(valor1);
			}
		}

		public String toString() {
			return "add";
		}
	}

	/**
	 * Implements the <code>div</code> instruction that replaces the top element
	 * of the stack with the result of dividing the element below the top of the
	 * stack with the element on top of the stack. For example, if the stack is
	 * <code><2 10 ...></code> the result of executing the <code>neg</code>
	 * instruction is the stack <code><5 ...></code>, since 10/2=5.
	 */
	static public class Div implements Instruction {

		/**
		 * Executes the <code>div</code> instruction.
		 * 
		 * @throws StackUnderFlowExc
		 *             if the stack contains fewer than two elements.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc {
			if (stack.size() < 2) {
				throw new StackUnderFlowExc();
			} else {
				int valor = stack.top();
				stack.pop();
				int valor1 = stack.top()/valor;
				stack.pop();
				stack.push(valor1);
			}
		}

		public String toString() {
			return "div";
		}
	}

	/**
	 * Implements the <code>power</code> instruction that replaces the top
	 * element of the stack with the result of raising the element below the top
	 * of the stack to the power of the element on top of the stack. For
	 * example, if the stack is <code><2 10 ...></code> the result of executing
	 * the <code>neg</code> instruction is the stack <code><100 ...></code>,
	 * since 10^2=100.
	 */
	static public class Power implements Instruction {

		/**
		 * Executes the <code>power</code> instruction.
		 * 
		 * @throws StackUnderFlowExc
		 *             if the stack contains fewer than two elements.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc, ArithmeticException {
			if (stack.size() < 2) {
				throw new StackUnderFlowExc();
			} else {
				int valor = stack.top();
				stack.pop();
				int valor1 = stack.top();
				stack.pop();
				if (valor1 == 0 && valor < 0) {
					throw new ArithmeticException();
				} else {
					stack.push((int) (Math.pow(valor1, valor)));
				}
			}
		}

		public String toString() {
			return "power";
		}
	}

	/**
	 * Implements the <code>drop</code> instruction that removes the top element
	 * of the stack. For example, if the stack is <code><3 ...></code> the
	 * result of executing the <code>drop</code> instruction is the stack
	 * <code><...></code>.
	 */
	static public class Drop implements Instruction {

		/**
		 * Executes the <code>drop</code> instruction.
		 * 
		 * @throws StackUnderFlowExc
		 *             if the stack is empty.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc {
			if (stack.isEmpty()) {
				throw new StackUnderFlowExc();
			} else {
				stack.pop();
			}
		}

		public String toString() {
			return "drop";
		}
	}

	/**
	 * Implements the <code>dup</code> instruction that pushes a new element on
	 * top of the stack, which is equal to the element at the top of the stack.
	 * For example, if the stack is <code><3 ...></code> the result of executing
	 * the <code>dup</code> instruction is the stack <code><3 3 ...></code>.
	 */
	static public class Dup implements Instruction {

		/**
		 * Executes the <code>dup</code> instruction.
		 * 
		 * @throws StackUnderFlowExc
		 *             if the stack is empty.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc {
			if (stack.isEmpty()) {
				throw new StackUnderFlowExc();
			} else {
				int valor = stack.top();
				stack.push(valor);
			}
		}

		public String toString() {
			return "dup";
		}
	}

	/**
	 * Implements the <code>swap</code> instruction that swaps the two top
	 * elements of the stack. For example, if the stack is
	 * <code><3 4 ...></code> the result of executing the <code>swap</code>
	 * instruction is the stack <code><4 3 ...></code>.
	 */
	static public class Swap implements Instruction {

		/**
		 * Executes the <code>swap</code> instruction.
		 * 
		 * @throws StackUnderFlowExc
		 *             if the stack contains fewer than two elements.
		 */
		public void execute(LIFO<Integer> stack) throws StackUnderFlowExc {
			if (stack.size() < 2) {
				throw new StackUnderFlowExc();
			} else {
				int valor = stack.top();
				stack.pop();
				int valor1 = stack.top();
				stack.pop();
				stack.push(valor);
				stack.push(valor1);
			}
		}

		public String toString() {
			return "swap";
		}
	}

}
