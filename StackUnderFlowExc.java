package aed.stackmachine;

/*
 * Defines an exception that should be raised when the number
 * of elements in the stack is less than what an instruction requires.
 */
public class StackUnderFlowExc extends Exception {
    public boolean equals(Object obj) {
	if (this == obj) return true;
	else return (obj instanceof StackUnderFlowExc);
    }
}
