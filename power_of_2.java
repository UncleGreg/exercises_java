
	public static void main(String[] args) {
		
		int number = 343454;
		int x = 0;
		
		while(x == 0){
			x = number % 2;
			number = number / 2;
			
					if(number == 1){
						break;
					}
		}
		if(x == 0){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}