package aed.stackmachine;

import aed.positionlist.*;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t0 = 
		    new Thread
		    (0,
		     new Instruction[]
			{new Instructions.Load(10), 
			 new Instructions.Load(20),
			 new Instructions.Add()});


		while (!t0.halted()) {
		    t0.executeInstruction(); 
		}

		System.out.println("Final thread status:");
		System.out.println(t0);
	}
}
