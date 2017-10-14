package aed.stackmachine;
import aed.lifo.*;

/**
 * Defines the methods that all instructions have
 */
public interface Instruction {
	/**
	 * Executes an instruction.
	 */
	void execute(LIFO<Integer> stack) throws Exception;
}
