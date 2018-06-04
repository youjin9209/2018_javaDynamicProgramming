/*
9461 - 파도반 수열
d[] 선언할때 long, int 조심  ! 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] d = new long[101];
		d[0] = 0;
		d[1] = 1;
		d[2] = 1;
		d[3] = 1;
		d[4] = 2;
		d[5] = 2;
		for(int i = 6; i <= 100; i++) {
			d[i] = d[i-1] + d[i-5];
		}
		while(T-- > 0) {
			int N = sc.nextInt();
			System.out.println(d[N]);
		}
	}
}
