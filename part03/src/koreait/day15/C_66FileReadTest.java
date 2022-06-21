package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class C_66FileReadTest {

	
	public static void main(String[] args) {
	
	String filename = "/Users/gimdong-gyu/Desktop/무제 폴더/자바테스트.txt";
//	String filename = "/Users/gimdong-gyu/Desktop/무제 폴더/자바테스트2.txt";		없는파일 테스트
	
				File file = new File(filename);
		//PrintWritter : 출력 기능을 갖는 클래스
		//	Unhandle exeception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.	
			
				Scanner sc = null;
		try {
				sc = new Scanner(file); 	// System.in : 표준입력(콘솔 입력)
			//System.out.println("파일에서 읽은 내용 : " + sc.nextLine());	// System.out : 표준 출력(콘솔출력)
				
			while(sc.hasNext()) {	// 구분자 엔터를 기준으로 다음데이터가 있으면 true
				System.out.println(sc.nextLine());
			}
				System.out.println("파일 읽기가 완료되었습니다");
			
		}catch(FileNotFoundException e) {
			//입력 기능에는 파일이 없으면 Exception 이 발생합니다.
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		}finally {
			if(sc != null)
			sc.close();
		}
				
	}
}

// tyr ~ catch 자원해제 방법을 finally 안쓰고 java 7버전 부터 다른 구문 형식 가능합니다.
//												try with resources	
//		ㄴ 관련된 인터페이스가 무엇인지도 찾아보기
// 다하고 파일 올렸으면 손들기!! 입출력 각각 테스트 해보세요. 파일은 1개에 모두 하세요.


