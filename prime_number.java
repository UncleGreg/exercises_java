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
		if(Prime.prime(71)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
	}
}