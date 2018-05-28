/*
11054 - 가장 긴 바이토닉 부분 수열 

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[1001];
		int[] d1 = new int[1001];
		int[] d2 = new int[1001];
		for(int i = 1; i <= N; i++)
			A[i] = sc.nextInt();
		d1[0] = 1;
		d2[0] = 1;
		for (int i = 1; i <= N; i++) {
			d1[i] = 1;
			for (int j = 1; j < i; j++) {
				if (A[i] > A[j] && d1[i] < d1[j] + 1) {
					d1[i] = d1[j] + 1;
				}
			}
		}
		for(int i = N; i >= 1; i--) {
			d2[i] = 1;
			for (int j = N; j > i; j--) {
				if (A[i] > A[j] && d2[i] < d2[j] + 1) {
					d2[i] = d2[j] + 1;
				}
			}
		}
		int ans = d1[0] + d2[0] -1;
		for(int i = 1; i <= N; i++) {
			if (ans < d1[i] + d2[i] -1)
				ans = d1[i] + d2[i] -1;
		}
		System.out.println(ans);
	}
}
