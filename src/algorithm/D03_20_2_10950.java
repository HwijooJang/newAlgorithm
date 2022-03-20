package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D03_20_2_10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st; // StringTokenizer를 st로 선언
		StringBuilder sb = new StringBuilder(); // StringBuilder를 사용해 st로 입력된것을 꺼내온다.
		
		for(int i=0 ; i<N ; i++) { // N개를 입력하면 더하고 싶은 숫자를 몇개 받아올것인지 정한다
			st=new StringTokenizer(br.readLine(), " "); // 더하고 싶은 숫자를 공백을 포함해 ex ex 식으로 넣는다.
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())); // st.nextToken()으로 받아오는것을 Int로 변환해주고 더하는 식을 넣는다.
			sb.append('\n');
		}
		System.out.println(sb);
        
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	}

}
