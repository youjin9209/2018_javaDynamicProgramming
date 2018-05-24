/*
1463 - 1로 만들기 
최소를 구하는거니까 조건문을 가지수가 많이 나오는 순부터 ! 
( 최소로 갱신하게 )
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] D =  new int[N+1];
		D[1] = 0;
		for (int i = 2; i <= N; i++)
		{
			// 3. 1을 뺀다 
			D[i] = D[i-1] + 1;
			// 2. X가 2로 나누어지면 2로 나눈
			if (i%2 == 0 && D[i] > D[i/2] + 1)
				D[i] = D[i/2] + 1;
			// 1. X가 3로 나누어지면 3로 나눈
			if (i%3 == 0 && D[i] > D[i/3] + 1)
				D[i] = D[i/3] + 1;
		}
		System.out.println(D[N]);
	}
}
