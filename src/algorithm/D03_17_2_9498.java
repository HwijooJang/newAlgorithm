package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D03_17_2_9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine()); // br에서 받아드려오는 String형식을 Integer.parseInt를 사용해 int형식으로 변환
		
		//if문을 사용하지 않고 삼항연산자를 사용해 if문을 대신하였다.
		System.out.println((A>=90) ? "A" : (A>=80) ? "B" : (A>=70) ? "C" : (A>=60) ? "D" : "F"); 

		
		/* 가장 기초적인 방식
		 * 
		 * public static void main(String[] args) { 
		 * Scanner in = new Scanner(System.in);
		 * 
		 * int A = in.nextInt(); 
		 * in.close();
		 * 
		 * if(A>=90) System.out.println("A");
		 * else if(A>=80) System.out.println("B");
		 * else if (A>=70) System.out.println("C"); 
		 * else if(A>=60)
		 * System.out.println("D"); else System.out.println("F"); }
		 * 
		 * }
		 */
		
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		// 참조 : https://www.acmicpc.net/problem/9498
	}

}
