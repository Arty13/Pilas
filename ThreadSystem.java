package aed.stackmachine;

import aed.fifo.*;
import aed.positionlist.*;

/**
 * Executes a set of threads using the "round-robin" scheduling algorithm.
 */
public class ThreadSystem {
	private FIFO<Thread> threads;
	private int maxInstructions;

	/**
	 * Creates a new <code>ThreadSystem</code> for executing a set of threads.
	 * 
	 * @param threads
	 *            the threads to execute
	 * @param maxInstructions
	 *            the maximum number of consecutive instructions to run a
	 *            thread. Note: if the system is composed of just a single
	 *            thread the <code>maxInstructions</code> parameter need not be
	 *            respected.
	 */
	public ThreadSystem(Thread[] threads, int maxInstructions) {
		this.threads = new FIFOList<Thread>();
		for (Thread thread : threads)
			this.threads.enqueue(thread);

		this.maxInstructions = maxInstructions;
	}

	/**
	 * Starts the execution of the thread system. Terminates when all threads
	 * have terminated.
	 */
	public void run() {

		while (threads.size() > 0) {
			Thread cadena = threads.first();
			threads.dequeue();
			int instrucciones = 0;
			while (!cadena.halted() && instrucciones < maxInstructions) {
				cadena.executeInstruction();
				instrucciones++;
			}
			if (!cadena.halted())
				threads.enqueue(cadena);

		}
	}
}
