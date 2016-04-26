public class bubble_sort {

	
	public static void main(String[] args) {
		
		int[] sort = {32,43,12,54,7,89,10};
		int remember;
		boolean check = false;
		
		System.out.println("Before sort " + Arrays.toString(sort));
		while(check == false){
			check = true;
		
		for(int i = 0; i < sort.length - 1; i++){
			if(sort[i] > sort[i+1]){
				remember = sort[i+1];
				sort[i+1] = sort[i];
				sort[i] = remember;
				check = false;
			}
		}
		}
		System.out.println("After sort " + Arrays.toString(sort));
	}
}