package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class C_65FileWriteTest {

	
	public static void main(String[] args) {
	
		String filename = "/Users/gimdong-gyu/Desktop/무제 폴더/자바테스트.txt";
	
				File file = new File(filename);
		//PrintWriter : 출력 기능을 갖는 클래스
		//	Unhandle exeception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.	
				PrintWriter pw = null;
		try {
			
		
			pw = new PrintWriter(file); // file 로 지정된 위치에 출력을 위한 객체
	//System.out.println(); 에서 System.out 대신에 파일 출력객체 pw		
			pw.println("모모 90 89 82");
			pw.println("사나 90 89 82");
			pw.println("나연 90 89 82");
			System.out.println("파일 출력이 완료되었습니다.");	// System.out : 표준 출력(콘솔출력)
		}catch(FileNotFoundException e) {
			//출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다.
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		}finally {
			pw.close();
		}
				
	}
}
