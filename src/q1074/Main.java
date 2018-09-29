package q1074;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, r, c, cnt, result;

	public static void solve(int x, int y, int n) {
//		System.out.println(x + " " + y + " " + n);
		if(n==2) {
			cnt++;
			if(x-1 == r && y-1 == c) result = cnt;
			cnt++;
			if(x-1 == r && y == c) result = cnt;
			cnt++;
			if(x == r && y-1 == c) result = cnt;
			cnt++;
			if(x == r && y == c) result = cnt;

			return;
		}
		
		solve(x-(n/4),y-(n/4),n/2);
		solve(x-(n/4),y+(n/4),n/2);
		solve(x+(n/4),y-(n/4),n/2);
		solve(x+(n/4),y+(n/4),n/2);
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		int size =  (int) Math.pow(2, N);
		
		solve(size/2,size/2,size);
		
		System.out.println(result-1);

		in.close();
	}
}
