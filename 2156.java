/*
2156 - 포도주 시식  
제한조건 잘 보기 !
- 연속으로 놓여있는 3잔을 모두 마실 수는 없다  :  현 상황에서 포도주를 몇잔 마셨나가 중요 ! 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[10001];
		for(int i = 1; i <= n; i++)
			A[i] = sc.nextInt();
		int[] d = new int[10001];
		d[1] = A[1];
		d[2] = A[1] + A[2];
		for (int i = 3; i <= n; i++) {
			d[i] = d[i-1];
			d[i] = Math.max(d[i], d[i-2] + A[i]);
			d[i] = Math.max(d[i], d[i-3] + A[i-1] + A[i]);
		}
		System.out.println(d[n]);
		
	}
}
