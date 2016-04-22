package tablica;
import java.util.Arrays;


public class array {

	public static void main(String[] args) {
		
		int[] swapEnds = {1, 2, 3, 4};
		int last;
		int first;
		System.out.println("Before: " + Arrays.toString(swapEnds));
	
			last = swapEnds[0];
			
			first = swapEnds.length - 1;
			
			swapEnds[0] = swapEnds[first];
			swapEnds[first] = last;
			
			System.out.println("After: " + Arrays.toString(swapEnds));
			
			
		
		}
	}
	