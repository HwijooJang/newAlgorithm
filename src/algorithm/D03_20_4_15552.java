package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D03_20_4_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<a ; i++) {
		st = new StringTokenizer(br.readLine(), " ");
		sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		sb.append('\n');
		}
		System.out.println(sb);
		
		// 데이터 양이 커지면 StringBuilder보다는 BufferedWriter를 사용한 후 
		// .flush와 .close를 사용해서 데이터를 비워주고 닫아주면은 처리속도가 더 빨라진다.
		// 문제에서는 BufferedWriter를 사용하라고 되어 있지만 StringBuilder를 사용해도 처리속도가 빠르다
		// 하지만 데이터 양이 커지는 로직이라면 BufferedWriter를 사용해주자
		
		/*
		 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와
		 * BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다. 첫 줄에
		 * 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1
		 * 이상, 1,000 이하이다.
		 */

	}

}
