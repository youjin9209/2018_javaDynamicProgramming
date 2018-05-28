
/*
11055 - 가장 큰 증가 부분수열
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[1001];
		int[] d = new int[1001];
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) 
			a[i] = sc.nextInt();
		d[0] = a[1];
		for (int i = 1; i <= N; i++) {
			d[i] = a[i];
			for (int j = 1; j < i; j++) {
				if (a[j] < a[i] && d[i] < d[j] + a[i]) 
					d[i] = d[j] + a[i];
			}
		}
		long ans = d[0];
		for (int i = 1; i <= N; i++) {
			if (ans < d[i])
				ans = d[i];
		}
		System.out.println(ans);
	}
}
