/*
11726 - 2*N 타일링  
런타임 에러 조심 !!!  
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
		d[1] = 1;
		d[2] = 2;
		for (int i = 3; i <= N; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] = d[i]%10007;
		}
		System.out.println(d[N]);
	}
}
