package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

//읽어올 수 있는 텍스트파일은 인코딩이 일치해야합니다.
// workspace UTF -8 이면 텍스트 파일 UTF-8형식만
//			Ms949 이면 텍스트 파일 ANSI 형식만
public class C67_ResourceClose {

	public static void main(String[] args) {
		// 파일 복사
//		String filename = "/Users/gimdong-gyu/Desktop/무제 폴더/자바테스트.txt"; // 읽기 : 존재하는 파일
//		String filename2 = "/Users/gimdong-gyu/Desktop/무제 폴더/자바테스트2.txt";	// 쓰기 : 존재하지 않는 파일

		//팡리 대화상자 사용학기
		String filename = fileDialogOpen(); //복사할 파일을 지정하세요.
		String filename2 = fileDialogSave();// 저장할 파일은 폴더를 찾아가서 파일명은 직접 쓰세요.
		
		File ifile = new File(filename);
		File ofile = new File(filename2);
		
		try(Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile)){
			while(sc.hasNext()) {
				String temp = sc.nextLine();	// 파일에서 일어온 1줄
				System.out.println(temp);		// 표준출력
				pw.println(temp);				// 파일 출력
			}
			System.out.println("파일 복사 와료");
			
		}catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("사용자 오류 발생: " + e.getMessage());
			System.out.println("저장된 파일이 없습니다.");
		}	catch(Exception e) { // FileNotFoundException 이외의 모든 Exception 처리
			System.out.println("알수 없는 오류 : " + e.getMessage());
		}
	
		
	}	// main	
		public static String fileDialogOpen(){
			// 콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
			// 자바에서도 GUI 를 만들수 있는 클래스들이 있습니다. 그 중 하나인 파일대화상자를 사용합니다. 라이브러리는 awt,swing,javaFX 등이 있습니다.
			// Windows OS는 프로그램들이 window라는 틀 안에서 만들어지는데 자바에서는 그것은 프레임이라고 합니다.
					
					JFrame f = new JFrame();  //파일대화상자를 시작할 프레임객체 생성
					
					FileDialog fdr = new FileDialog(f,"파일 열기",FileDialog.LOAD);	//파일대화상자 객체 생성
					fdr.setVisible(true);		//파일 대화상자 보이기
					
					String filename = fdr.getDirectory() + fdr.getFile(); 	//선택한 파일의 경로와 파일명 연결
					System.out.println("선택한 경로와 파일 : " + filename);
//					System.out.println("선택한 경로 : " + fdr.getDirectory() + ",선택한 파일:" + fdr.getFile());
					File file = new File(filename);
					System.out.println("선택한 파일 크기 : " + file.length() + "바이트");
					
					
			
					return filename;
					}
		
		public static String fileDialogSave() {
			JFrame f = new JFrame(); 
			FileDialog fdw = new FileDialog(f,"파일 열기",FileDialog.SAVE);
			fdw.setVisible(true);
			
			String filename = fdw.getDirectory() + fdw.getFile(); // 선택한 파일의 경로와 파일명 연결
			System.out.println("저장한 파일와 결로 : " +fdw.getDirectory() + fdw.getFile());
			return filename;
		
		
		}
		
		
		
		
		
	}	// class
/*
 * with - resources : 키워드가 아니고 리소스를 다루는 (처리하는) try 문
 * AutoClosable Interface
 * try-with-resource 방식을 사용하려면 사용하는 객체가 AutoClosable 인터페이스
 * Implement 해서 사용가능해야함.Scanner,PrinWriter 는 AutoClosable 구현 클래스는
 * ==>> AutoClosable 을 구현한 객체라면 try문이 종료될 때 close()구문을 호출해줌
 */




