package zad3;

public class string {

	public static void main(String[] args) {
		
		String word = "Kiełbasa";
		int n = 3;
		int length = word.length();
		String wordAfter = word.substring(0, n) + word.substring(length -n,length);
		System.out.println(wordAfter);	
	}
}
