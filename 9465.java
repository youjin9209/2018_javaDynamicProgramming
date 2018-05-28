/*
9465 - 스티커 
D[i][j] = 2 * i 에서 얻을 수 있는 최대 점수 / i번 열에서 뜯는 스티커 j
j = 0 -> 뜯지 않음
j = 1 -> 위쪽 스티커 뜯음 
j = 2 -> 아래쪽 스티커 뜯음 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(bf.readLine());
		while(T-- > 0) {
			int n = Integer.valueOf(bf.readLine());
			long[][] A = new long[n+1][2];
			long[][] d = new long[n+1][3];
			String[] line1 = bf.readLine().split(" ");
			for (int i = 1; i <= n; i++) {
				A[i][0] = Long.valueOf(line1[i-1]);
			}
			String[] line2 = bf.readLine().split(" ");
			for (int i = 1; i <= n; i++) {
				A[i][1] = Long.valueOf(line2[i-1]);
			}
			for (int i = 1; i <= n; i++) {
				d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
				d[i][1] = Math.max(d[i-1][0], d[i-1][2]) + A[i][0];
				d[i][2] = Math.max(d[i-1][0], d[i-1][1]) + A[i][1];
			}
			long ans = 0;
			ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
			System.out.println(ans);
		}
	}
}
