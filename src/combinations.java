public class combinations {
	public static void main(String[] args){
		factorialize(-1);
		factorialize(0);
		factorialize(3);
		factorialize(7);
	}
	
	/**
	 * takes an integer and prints out all combinations of the positive integers less than
	 *  or equal to the given integer, and then prints how long it took to accomplish
	 * @param n
	 */
	public static void factorialize(int n){
		long time1 = System.currentTimeMillis();
		if(n > 0){
			String start = "1";
			if(n == 1){
				System.out.println(start);
			}else{
				System.out.println("start = " + start);
				insert(2,n,start);
			}
		} else {
			System.out.println(n + " is not a positive integer");
		}
		long time2 = System.currentTimeMillis();
		System.out.println("Time: " + (time2 - time1));
	}
	
	
	/**
	 * Takes two integers and a string and places the first integer throughout 
	 * the string, and then repeats until it reaches the second integer, then prints that
	 * EX: 2, 3, "1" => "21" and "12", then continues to and prints "321", "231", "213", "321", "231", and "213"
	 * @param i
	 * @param n
	 * @param current
	 */
	public static void insert(int i, int n, String current){
		if(i > n){
			System.out.println(current);
		} else {
			int end = current.length();
			int j = 0;
			i++;
			while (j <= end){
				String newString = current.substring(0, j) + Integer.toString(i-1) + current.substring(j, end);
				insert(i, n, newString);
				j++;
			}
		}
	}
	
	


	

}