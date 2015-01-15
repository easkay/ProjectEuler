class NatNum{
	public static void main(String[] args) {
		long sum,limit;
//		int limit;
		try{
			limit = Long.parseLong(args[0]);
		}
		catch(Exception e){
			System.err.println("Incorrect format");
			return;
		}
		sum = 0;
		for(long i = 3; i < limit; i++){
			if(i % 3 == 0 || i % 5 == 0) sum += i;
		}
		System.out.println(sum);
	}
}