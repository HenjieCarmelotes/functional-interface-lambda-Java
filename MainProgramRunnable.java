package functional_Interface;

public class MainProgramRunnable {
	
	
	public static void main(String[] args) {
		
		/*Implementing Runnable interface for printing Strings 5 times */
		
		doSeveralTimes( () -> System.out.print("Hello World "), 5 );
		System.out.println();
		
		
		/*Implementing Runnable interface for printing set of Numbers 15 times */
		doSeveralTimes( () -> {
			// count from 1 up to some random number between 5 and 25
			int count = 5 + (int)(21*Math.random());
			for (int i = 1; i <= count; i++)
				System.out.print(i + " ");
			System.out.println();
			}, 15);
		
		/*Implementing Runnable interface for printing set of characters A-Z 5 times */
		doSeveralTimes( () -> {
			char letter = 'Z';
			for (char i = 'A'; i <= letter; i++)
				System.out.print(i + " ");
			System.out.println();
			}, 20);
	
		
	} //end of main()
	
	
	
	static void doSeveralTimes( Runnable task, int repCount ) {
		for (int i = 0; i < repCount; i++) {
			task.run(); // Perform the task!
		}
	} //end of doSeveralTimes()
	

} //end of class MainProgramRunnable
