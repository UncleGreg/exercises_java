package ex1;

public class Prime {
	
	public static boolean prime(int number){
		for(int i = 2; i<= number/2; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
			System.out.println(Prime.prime(71));
		
	}
}