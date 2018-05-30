/*
2579 - 계단오르기 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[301];
		for (int i = 1; i <= N; i++)
			a[i] = sc.nextInt();
		int[] d = new int[301];
		d[1] = a[1];
		d[2] = a[1] + a[2];
		for (int i = 3; i <= N; i++) {
			d[i] = Math.max(d[i-3] + a[i-1] + a[i], d[i-2] + a[i]);
		}
		System.out.println(d[N]);
	}
}
