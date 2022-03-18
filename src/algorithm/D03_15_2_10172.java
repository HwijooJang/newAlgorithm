package algorithm;

public class D03_15_2_10172 {

	public static void main(String[] args) {
		/*
		 * StringBuffer sb = new StringBuffer();
		 * 
		 * sb.append("|\\_/|\r\n"); 
		 * sb.append("|q p|   /}\r\n");
		 * sb.append("( 0 )\"\"\"\\\r\n"); 
		 * sb.append("|\"^\"`    |\r\n");
		 * sb.append("||_/=\\\\__|\r\n");
		 * 
		 * System.out.println(sb);
		 */ // 제출하였지만 출력형식이 잘못되었음.
		
		StringBuilder sb = new StringBuilder();
		  
		  sb.append("|\\_/|\n"); 
		  sb.append("|q p|   /}\n");
		  sb.append("( 0 )\"\"\"\\\n"); 
		  sb.append("|\"^\"`    |\n");
		  sb.append("||_/=\\\\__|\n");
		  
		  System.out.println(sb);
		
		  // 멀티쓰레드를 사용하는게 아니기 때문에 StringBuilder를 사용하고
		  // '\r' 을 전체적으로 삭제해주었다.
	}

}
