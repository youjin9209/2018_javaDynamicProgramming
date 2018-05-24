/*
11052 - 붕어빵 판매하기 
Bottom Up 
타고 올라가는 그 느낌 ㅇㅋ 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[1001];
		int[] p = new int[1001];
		d[0] = 0;
		p[0] = 0;
		for (int i = 1; i <= N; i++) {
			p[i] = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if (d[i] < p[j] + d[i-j]) {
					d[i] = p[j] + d[i-j];
				}
			}
		}
		System.out.println(d[N]);	
	}
}
