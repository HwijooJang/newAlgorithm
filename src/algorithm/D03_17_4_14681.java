package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D03_17_4_14681 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		if(X > 0) {
			if(Y > 0) {
			System.out.print(1);
		} else {
			System.out.print(4);
		}
		}
		
		else { if(Y > 0) {
			System.out.print(2);
		} else {
			System.out.print(3);
		}

		}
		
		// 먼저 큰 틀로 X 좌표가 0보다 큰지, 작은지를 판별 한 뒤, 
		// Y 좌표의 값에 따라 최종적으로 몇 사분면에 있는지 검사하는 방법이다.
		
		
		// 문제 : https://www.acmicpc.net/problem/14681
		// 참조 : https://st-lab.tistory.com/60?category=830664
		
		
	}

}
