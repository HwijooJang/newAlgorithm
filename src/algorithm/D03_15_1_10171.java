package algorithm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*public class D03_15_10171 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
        bw.write("\\    /\\\r\n"
        		+ " )  ( ')\r\n"
        		+ "(  /  )\r\n"
        		+ " \\(__)|");
        bw.flush();
        bw.close();
        */ // 이렇게 풀이 하였지만 출력형식이 잘못되었다고 함
          // BufferedWriter를 사용할거면 아래처럼 줄 구분을 사용한다.
        public class D03_15_1_10171 {

        	public static void main(String[] args) throws IOException {
        		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
        		
                bw.write("\\    /\\");
                bw.newLine(); // 줄 구분
                
                bw.write(" )  ( ')");
                bw.newLine();
                
                bw.write("(  /  )");
                bw.newLine();
                
                bw.write(" \\(__)|");
                bw.newLine();
                
                bw.flush();
                bw.close();
                
                // StringBuffer sb = new StringBuffer();
                //sb.append("\\    /\\\r\n");
                //sb.append(" )  ( ')\r\n");
                //sb.append("(  /  )\r\n");
                //sb.append(" \\(__)|");
                
                //System.out.println(sb);
                // StringBuffer를 사용할거면 위 처럼 사용하면 된다.
        	
	}

}
