package io01;

import java.io.FileWriter;
import java.io.IOException;

public class FileO1_674p {

	public static void main(String[] args) throws IOException {
		
		//  외부에 텍스트파일을 만들기
		// 변수 생성 > 파일 경로 작성.
		// 메인메소드에 throws IOException 작성 필수.
		
		// 아래 두가지 구문으로 만들수있다.
		
		//FileOutputStream output = new FileOutputStream("/Users/aehobakk/Desktop");
		
		FileWriter output2 = new FileWriter("file:///Applications/eclipse/");
		
		//output.write("111");
		output2.write("12345");
		
		output2.close();

	}

}
