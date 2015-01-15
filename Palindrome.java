class Palindrome{
	private static long start = System.nanoTime();
	private static int largestPalindrome;

	public static void main(String[] args) {
		int testNumber = 0;
		largestPalindrome = 0;
		int i = 999;
		do{
			int j = 990;
			while(j > 999){
				j -= 1;
				testNumber = i * j;
				if(testNumber > largestPalindrome)
					check_palindrome(testNumber);
			}
			i--;
		}while(/*!check_palindrome(testNumber)*/i > 900);
		System.out.println(largestPalindrome);
		System.out.println((System.nanoTime() - start));
	}
	
	private static boolean check_palindrome(int number){
		char[] numberString = Integer.toString(number).toCharArray();
		for(int i = 0; i < 1+numberString.length/2; i++){
			if(numberString[i] != numberString[numberString.length - 1 - i]){
				return false;
			}
		}
		if(number > largestPalindrome)
			largestPalindrome = number;
		return true;
	}

}