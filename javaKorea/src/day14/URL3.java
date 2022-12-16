package day14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class URL3 {
	public static void main(String[] args) {
		InputStream is = null;			// 내 프로그램이 데이터를 가져올 때는 InputStream
		InputStreamReader isr = null;		// 문자열 형식이 안맞을 수 있어서 UTF-8로 변환
		BufferedReader br = null;			// 문자열로 바꾸기 위해 버퍼단위로 읽음
		URL url;							// HTTP 통신
		String str = null;
		ArrayList<String> parseArray = new ArrayList<>();
		
		
		try {
			url = new URL("https://sports.news.naver.com/wfootball/record/index");
			is = url.openStream();
			isr = new InputStreamReader(is, "UTf-8");
			br = new BufferedReader(isr);
			
			while((str = br.readLine()) != null){		// br.readLing() : 한줄씩 읽기
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
