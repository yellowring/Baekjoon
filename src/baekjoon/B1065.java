import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class B1065 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); // N 입력 받음;
		in.close();
		
		int count = 0;

		if(N<100) 
		{ 
			System.out.println(N);
		}
		
		else 
		{
			count = 99;
			if(N == 1000) {
				N = 999;
			}
			for (int i = 100; i <= N; i++) {
				
				int bak = i/100;
				int sib = (i/10)%10;
				int ill = i%10;
				
				if(bak-sib == sib-ill) {
					count++;
				}

			}
			System.out.println(count);

		}
		
	}
}