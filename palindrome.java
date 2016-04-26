package ex1;

public class palindrome {

	public static void main(String[] args) {
	
		int originalNumber = 312213;
		int number = originalNumber;
		int reverse = 0;
		int x;
		
		while(number != 0){
			
			x = number % 10;
			reverse = reverse * 10 + x;
			number = number / 10;						
		}
			if(originalNumber == reverse){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
	