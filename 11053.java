/*
11053 - 가장 긴 증가하는 부분 수열 
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
		for (int i = 1; i <= N; i++)
			A[i] = sc.nextInt();
		int[] d = new int[1001];
		d[0] = 1;
		for(int i = 1; i <= N; i++) {
			d[i] = 1;
			for (int j = 1; j < i; j++) {
				if (A[j] < A[i] && d[i] < d[j]+1) {
					d[i] = d[j]+1;
				}
			}
		}
		int ans = d[0];
		for (int i=1; i<= N; i++) {
		    if (ans < d[i]) {
			ans = d[i];
		    }
		}
			System.out.println(ans);
	}
}
