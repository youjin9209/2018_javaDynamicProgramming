/*
2225 - 합분해 
d[K][N] = sum (d[K-1][N-L])   (0 <= L <= N)
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static long mod = 1000000000L;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[][] d = new long[K+1][N+1];
		d[0][0] = 1;
		for(int i = 1; i <= K; i++) {
			for(int j = 0; j <= N; j++) {
				for (int l = 0; l <= j; l++) {
					d[i][j] += d[i-1][j-l];
					d[i][j] %= mod;
				}
			}
		}
		System.out.println(d[K][N]);
	}
}
