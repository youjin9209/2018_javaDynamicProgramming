/*
9095 - 1,2,3 더하기 
공식부터 구하긔  
d[0] = 0 기본적으로 idx가 0 일때, 값이 0 으로 초기화가 되는데   
내가 구한 식으로부터 다시 한번 검산과정 거쳐야한다. 만약, d[0] 값이 0 이 아니라면 고쳐줘야함 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] d = new int[11];
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		for (int i = 4; i <= 10; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			System.out.println(d[n]);
		}
	}
}
