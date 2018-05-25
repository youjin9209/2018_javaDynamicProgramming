/*
11057 - 오르막수 
등차수열 합  / 개수를 구하는거니까 쓰레기값 처리할 때 조심 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static long mod = 10007;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		int[][] d = new int[1001][11];
		// N = 1 초기화 
		for (int j = 0; j <= 9; j++) 
			d[1][j] = 1;
		// N >= 2 
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= j; k++) {
					if (d[i][j] < 0) // 쓰레기값 처리 
						d[i][j] = 0;
					else {
						d[i][j] += d[i-1][k];
						d[i][j] %= mod;
					}
				}
			}
		}
		for (int i = 0; i <= 9; i++) {
			 ans += d[N][i];
		}
		ans %= mod;
		System.out.println(ans);
	}
}
