package ex1;

public class armstrong {

	public static void main(String[] args) {
		
		int originalNumber = 370;
		int number = originalNumber;
		int a;
		int b;
		int c;
		
		a = number % 10;
		b = number / 10 % 10;
		c = number / 100 % 10;
		
		int finalNumber = a*a*a + b*b*b + c*c*c;
		
		if(finalNumber == originalNumber){
			System.out.println("true");
		}else{
			System.out.println(false);
		}
	}
}