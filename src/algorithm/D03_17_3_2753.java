package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D03_17_3_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		
		// 이것도 동일하게 if문 대신 삼항연산자를 사용했다.
		System.out.println
		( (A%4==0) ? ((A%400==0) ? "1" : (A%100==0) ? "0" : "1") : "0");

		// 여기서 문제의 알고리즘은 먼저 4의 배수인지 여부를 본 뒤 4의 배수일 경우 400으로 나뉘어 떨어지는지,
		// 100으로 나뉘어 떨어지는 여부를 검사한다.
		
		
		/* 삼항연산자 대신 if else문을 사용한 것
		 * 
		 * public static void main(String[] args) throws IOException {
		 *    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * int a = Integer.parseInt(br.readLine());
		 * 
		 * if(a%4==0) { if(a%400==0) System.out.println("1");
		 * else if(a%100==0)
		 * System.out.println("0"); 
		 * else System.out.println("1"); }
		 * else System.out.println("0");
		 */
		
		/*
		 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		 * 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
		 * 1900년은 100의 배수이고 400의 배수는 아니기 때문에
		 * 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다
		 */
		// 참조 : https://st-lab.tistory.com/23?category=830664
	}

}
