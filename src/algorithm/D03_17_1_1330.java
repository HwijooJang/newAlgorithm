package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D03_17_1_1330 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	//br.readLine() 으로 읽어온 것을 split(" ")로 하여금 공백단위로 나눠준 후 String배열에 각각 저장하는 방법
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		// if문 대신 삼항연산자 사용
		System.out.println((A>B) ? ">" : ((A<B) ? "<" :  "=="));
			
		
		/* 기본적인 Scanner와 if문을 사용한 방식
		 * 
		 * public static void main(String[] args) { 
		 * Scanner in = new Scanner(System.in);
		 * 
		 * int A = in.nextInt();
		 * int B = in.nextInt();
		 * 
		 * in.close();
		 * 
		 * if(A>B) System.out.println(">"); 
		 * else if(A<B) System.out.println("<");
		 * else System.out.println("==");
		 * 
		 * }
		 * 
		 * }
		 */
		
			//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		// 참조 : https://st-lab.tistory.com/21
	}

}
