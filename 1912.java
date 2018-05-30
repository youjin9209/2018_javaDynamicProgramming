/*
1912 - 연속합
주의) test case 가 음수만 나올 경우 !! 
초기 정답 값을 0으로 세팅하면 당연히 틀림 !!

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[100001];
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		long[] d = new long[100001];
		d[1] = a[1];
		for (int i = 2; i <= N; i++) {
			d[i] = a[i];
			d[i] = Math.max(d[i-1] + a[i], a[i]);
//			if (d[i] < d[i-1] + a[i])
//				d[i] = d[i-1] + a[i];
		}
		//System.out.println(d[0]);
		long ans = d[1];
		for (int i = 1; i <= N; i++) {
			if (ans < d[i])
				ans = d[i];
		}
		System.out.println(ans);
	}
}
