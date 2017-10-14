package aed.stackmachine;

import aed.positionlist.*;

public class FullExample {
    public static void main(String[] args) {
	Thread t0 =
	    new Thread
	    (0,
	     new Instruction[]
	     {
		 new Instructions.Load(10), 
		 new Instructions.Load(20),
		 new Instructions.Add()
	     });
	Thread t1 =
	    new Thread
	    (1,
	     new Instruction[]
	     { 
		 new Instructions.Load(5), 
		 new Instructions.Load(7),
		 new Instructions.Add()
	     });
	Thread t2 =
	    new Thread
	    (2,
	     new Instruction[]
	     { 
		 new Instructions.Load(5), 
		 new Instructions.Add()
	     });
	Thread t3 =
	    new Thread
	    (3,
	     new Instruction[]
	     { 
		 new Instructions.Load(273), 
		 new Instructions.Load(15),
		 new Instructions.Add(),
		 new Instructions.Dup()
	     });
	Thread t4 =
	    new Thread
	    (4,
	     new Instruction[]
	     { 
		 new Instructions.Load(0),
		 new Instructions.Load(273), 
		 new Instructions.Div(),
		 new Instructions.Swap()
	     });

	ThreadSystem system = 
	    new ThreadSystem(new Thread[] {t0,t1,t2,t3,t4}, 1);
	system.run();
    }
}
