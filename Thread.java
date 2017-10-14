package aed.stackmachine;

import aed.lifo.*;
import aed.positionlist.*;

/**
 * Provides methods for creating threads that execute virtual
 * machine instructions, and the relevant data structures such
 * as e.g. a stack.
 */
public class Thread {
	private int id;
	private LIFO<Integer> stack;
	private Instruction[] instructions;
	private int pc;
	private boolean raisedException;
	private Throwable exception;
        private static PositionList<Thread> terminated;

       /**
	* Creates a new thread.
	* param id the identity (an integer) of the thread
	* param instructions an array of instructions to execute
	*/
	public Thread(int id, Instruction[] instructions) {
		this.id = id;
		this.pc = 0;
		this.stack = new LIFOList<Integer>();
		this.instructions = instructions;
		this.raisedException = false;
	}

        /**
	 * Returns the identity of the thread. 
	 */
	public int getId() {
		return id;
	}

        /**
	 * Returns <code>true</code> if the execution of the
	 * thread has terminated, i.e., because there are no more
	 * instructions to execute, or because the execution of 
	 * an instruction raised an exception.
	 */
	public boolean halted() {
		return pc >= instructions.length || raisedException;
	}

        /**
	 * Returns <code>true</code> if the execution of the thread
	 * was halted by an exception.
	 */
	public boolean raisedException() {
		return raisedException;
	}

        /**
	 * Returns the exception that was raised 
	 * (i.e., if <code>raisedException</code> returns true).
	 */
	public Throwable getException() {
		return exception;
	}

        /**
	 * Execute a single virtual machine instruction.
	 */
	public void executeInstruction() {
		Instruction inst = instructions[pc];
		try { 
			inst.execute(stack); 
			pc++;
		}
		catch ( Exception exc ) {
			raisedException = true;
			exception = exc;
		}
		if (halted()) terminated.addLast(this);
	}

        public void resetTerminated() {
	    terminated = new NodePositionList<Thread>();
        }
    
	public String toString() {
		String excString;
		if (raisedException())
			excString = ",exception="+getException();
		else
			excString = "";

		return "Thread("
		+"id="+id
		+",pc="+pc
		+",stack.size()="+stack.size()
		+",stack="+stack
		+",halted="+halted()
		+",raisedException="+raisedException()
		+excString
		+")";
	}
}
