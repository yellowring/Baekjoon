package baekjoon;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class B1065 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); 
		int result = 0;
		
		for(int i = 0 ; i < N ; i ++) {
			
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if(i+sum==N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		
	}
}