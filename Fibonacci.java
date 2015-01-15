import java.util.ArrayList;
class Fibonacci{
	public static void main(String[] args) {
		System.out.println(sumTerms(args));
	}
	
	public static int sumTerms(String[] args){
		int limit = 0;
		int total = 0;
		try{
			limit = Integer.parseInt(args[0]);
		}
		catch(Exception e){
			System.err.println("Incorrectly formatted number.");
			return -1;
		}
		ArrayList<Integer> sequence = removeOdd(calcEvenFib(limit));
		for(Integer number : sequence){
			total += number;
		}
		return total;
	}
	
	public static ArrayList<Integer> calcEvenFib(int limit){
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		sequence.add(1);
		sequence.add(1);
		for(int i = 1; i < limit; i++){
			int newTerm = sequence.get(i-1) + sequence.get(i);
			if(newTerm > limit) return sequence;
			sequence.add(newTerm);
		}
		return sequence;
	}
	
	public static ArrayList<Integer> removeOdd(ArrayList<Integer> inputSequence){
		for(int i = inputSequence.size() - 1; i >= 0; i--){
			if(inputSequence.get(i) % 2 == 0) inputSequence.remove(i);
		}
		return inputSequence;
	}
}