/*
10844 - 쉬운 계단 수  
점화식 : d[i][j] = d[i-1][j-1] + d[i-1][j+1] 
왜 나눠서 더해줬는지 ! 
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
		int[][] d = new int[101][10];
        long ans = 0;
        for (int j = 1; j <= 9; j++) {
            d[1][j] = 1;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                d[i][j] = 0;
                if (j-1 >= 0) {
                    d[i][j] += d[i-1][j-1];
                }
                if (j+1 <= 9) {
                    d[i][j] += d[i-1][j+1];
                }
                d[i][j] %= mod;
            }
        }
        for (int i = 0; i <= 9; i++) {
            ans += d[N][i]; 
        }
        ans %= mod;
        System.out.println(ans);
	}
}
