/*
1699 - 제곱수의 합 
-> 마지막 항을 기준으로 ! 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[100001];
		d[1] = 1;
		d[2] = 2;
		for(int i = 3; i <= N; i++) {
			d[i] = i;
			for (int j = 1; j*j <= i; j++) {
				if (d[i] > d[i-j*j] + 1)
					d[i] = d[i-j*j] + 1;
			}
		}
		System.out.println(d[N]);
	}
}
