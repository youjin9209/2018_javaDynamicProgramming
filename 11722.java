/*
11722 - 가장 긴 감소하는 부분순열 

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
		int[] d = new int[1001];
		for(int i = 1; i <= N; i++)
			A[i] = sc.nextInt();
		d[0] = 1;
		for(int i = N; i >= 1; i--) {
			d[i] = 1;
			for (int j = N; j > i; j--) {
				if (A[i] > A[j] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		int ans = d[0];
		for(int i = 1; i <= N; i++) {
			if (ans < d[i])
				ans = d[i];
		}
		System.out.println(ans);
	}
}
