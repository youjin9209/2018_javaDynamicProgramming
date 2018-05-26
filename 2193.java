/*
2193 - 이친수
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] d = new long[91];
		d[1] = 1;
		d[2] = 1;
		for (int i = 3; i <= N; i++) 
			d[i] = d[i-1] + d[i-2];
		System.out.println(d[N]);
	}
}
