
public class AppIsPrime {
	
	public static void main(String[] args) {
		
		int testNumber = 6;
		
		boolean isPrime = AppIsPrime.checkIfPrime(testNumber);
		System.out.println("Is testNumber Prime:  " + isPrime);
	}

	private static boolean checkIfPrime(int testNumber) {
		boolean primeness = true;		
		for(int i = 2; i < testNumber; i++ ) {
			if(testNumber % 2 ==0) {
				return false;
			}
		}
		return primeness;
	}

}
