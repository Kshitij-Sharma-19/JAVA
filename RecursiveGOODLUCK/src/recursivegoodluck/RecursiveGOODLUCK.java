package recursivegoodluck;

public class RecursiveGOODLUCK {
	// f(f(f(x)))--- a = 20
	// f(a) = 5+ a
	// f(20) = 5+20 = 25
	
	// f(f(f(20)))--- f(f(25))
	
	// f(25) = 5 + 25 = 30 
	
	// f(f(f(20)))--- f(f(25))--- f(30)
	
	// f(30) = 5 + 30 = 35
	
	// f(f(f(20))) -- f(f(25)) --- f(30) --- 35
	
	// 5+4+3+2+1 ; 7+6+5+4+3+2+1; 2+1;
	
	public static int Summation(int n) {
		// Base Case: WE ARE AT THE END
		if (n <= 0) {
			return 0;
		} 
		// Recursive Case: Keep Going
		else {
			return n + Summation(n-1);
		}	
	}
	
	public static int Factorial(int n) {
		// Base Case:
		if ( n <= 1) {
			return 1;
		}
		// Recursive Case:
		else {
			return n * Factorial(n-1);
		}
	}
	
	public static int Exponentiation(int n, int p) {
		// Base Case:
		if (p <= 0) {
			return 1;
		}
		// Recursive
		else {
			return n * Exponentiation(n, p-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Summation(3));
		System.out.println(Factorial(3));
		System.out.println(Exponentiation(5,3));
	}

}
