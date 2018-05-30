/*
2133 - 타일 채우기 
d[0] = 1
-> '아무것도 안 한 경우'를 하나로 세는 겁니다. 그래야 '아무것도 안 한 상태'에서 다음 어떤 타일을 놓는 경우를 셀 때 각각을 하나의 경우로 셀 수 있기 때문입니다.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[31];
		d[0] = 1;

		for(int i = 2; i <= N; i+=2) {
			d[i] = 3*d[i-2];
			for (int j = i-4; j >= 0; j-=2) {
				d[i] += 2*d[j];
			}
		}
		System.out.println(d[N]);
	}
}
