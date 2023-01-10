package functional_Interface;

public class MainProgramSquareRoot {
	
	public static void main(String[] args) {
		
		System.out.print("The sum of a number squared for that number from 1 to 100 in lambda expression: ");
		System.out.println( sum( x -> x*x, 1, 100 ) );
		
		System.out.print("The sum of a number squared for that number from 1 to 100 in method reference which is"
				+ "a shorhand expression for any lambda expression that has the same variable as in the interface: ");
		System.out.println( sum( Math::sqrt, 1, 100 ) );
		
		
		
		System.out.print("The sum of 2 raised to the power n, for n from 1 to 10 is ");
		System.out.println( sum( num -> Math.pow(2,num), 1, 10 ) );
		
	} //end of main()
	
	/**
	* 
	* For a function f, compute f(start) + f(start+1) + ... + f(end).
	* The value of end should be >= the value of start. 
	*/
	static double sum( FunctionSqrRoot f, int start, int end ) {
		double total = 0;
		for (int n = start; n <= end; n++) {
			total = total + f.valueAt( n );
		}
		return total;
	} //end of sum

}
