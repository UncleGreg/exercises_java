

import java.util.*;
import java.lang.*;
import java.io.*;

class FizzBuzz
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number;
 
		for(int i=1; i<=100;i++) {
 
			number = i;
			if(number % 3 == 0 && number % 5 == 0){
				System.out.println("FizzBuzz");
			}else if (number % 3 == 0){
				System.out.println("Fizz");
			}else if(number % 5 == 0){
				System.out.println("Buzz");
			}else{
				System.out.println(number);
			};
		}
	

	}
}