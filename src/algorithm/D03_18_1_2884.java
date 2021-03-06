package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D03_18_1_2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[]str = br.readLine().split(" ");
		int H = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		if(M < 45) {
		 H--;
		 M = 60 - (45 - M);
		
		if(H < 0) {
			H = 23;
		}
		System.out.println(H + " " + M);
			
		} else {
			System.out.println(H + " " + (M - 45));
		}
		
		
		/* 이 문제의 알고리즘
		 * 
		 * 입력받은 분(minute) 을 45 기준으로 45보다 작으면 시(hour)을 -1 해주고 아닐경우 입력받은 분(minute)에 -45 를
		 * 해주면 된다. 또한 시(hour)가 0보다 작아질 경우 시(hour) 을 23으로 수정해준다.
		 * 
		 * 즉, 1-1 단계 : 45분보다 작은지 여부 - if (min < 45 )
		 *  2-1 단계 : 시(hour) 가 0보다 작은지 여부 - if
		 * (hour < 0 ) 1-2 단계 : 1단계 조건 외 여부 - else
		 */

		
		
		
		
		/*
		 * 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
		 * 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
		 * 이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
		 * 바로 "45분 일찍 알람 설정하기"이다.
		 * 이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더
		 * 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		 * 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
		 */
		
		// 참조 : https://st-lab.tistory.com/24
		}

}
