package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D03_15_11_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		char[] b = B.toCharArray(); // 문자열을 char형태로 반환해주는 메소드
		
		System.out.println(a * (b[2]-'0')); // B에 입력된 3번째 자리에 위치한 배열을 하나씩 가져온다는 명령어 
		System.out.println(a * (b[1]-'0'));
		System.out.println(a * (b[0]-'0'));
		System.out.println(a * Integer.parseInt(B)); // Integer.parseInt -> String메소드를 Int메소드로 전환을 시켜준다 (여기서는 B를 Int로 변환)
		
		
		// 문제 : https://www.acmicpc.net/problem/2588
		// 답안 참조 : https://st-lab.tistory.com/20 3번째방법
	}

}