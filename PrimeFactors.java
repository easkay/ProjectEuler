import java.lang.Math;
class PrimeFactors{
	
	private static long primeTimeProcessing;
	
	public static void main(String[] args) {
	long testNumber = 600851475143L;
	long lastPrime = 0;
	long startTime;
	//primeTimeProcessing = 0;
	/*	try{
			testNumber = Long.parseLong(args[0]);
		}
		catch(NumberFormatException e){
			return;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("You need to specify a number.");
		}
		startTime = System.nanoTime();*/
		long test = 2;
	   	while(testNumber > 1){
	   		if(testNumber % test == 0){
	   			testNumber = testNumber / test;
	   			lastPrime = test;
	   		}
	   		else{
	   			test = nextPrime(test);
	   		}
	    }
		//System.out.println(lastPrime);
		//System.out.println(System.nanoTime() - startTime);
		//System.out.println("Total time processing primes: " + primeTimeProcessing);
	}
	
	public static boolean checkPrime(long number){
		//long start = System.nanoTime();
		for(int i = 2; i <= (int) Math.sqrt((double) number); i++)
			if(number % i == 0){ 
				//primeTimeProcessing += System.nanoTime() - start;
				return false;
			}
		//primeTimeProcessing += System.nanoTime() - start;
		return true;
	}
	
	private static long nextPrime(long number){
		if(number % 2 == 0)
			number++;
		else
			number += 2;
		if(checkPrime(number) && number > 2)
			return number;
		else
			return nextPrime(number);
	}
}