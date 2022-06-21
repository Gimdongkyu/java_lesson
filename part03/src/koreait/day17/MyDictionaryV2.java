package koreait.day17;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;

public class MyDictionaryV2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); // 키보드 입력시 nextLine() 과 nextInt() 등을 같이 쓰면 입력이 정상 실행 안됩니다.
			Scanner ssc = new Scanner(System.in);
	List<Word> myword = new ArrayList<>(); // **mydic을 myword로 바꿔서 구현해보기**
	
	try {
		System.out.println("파일에 저장할까요? (y or n) >>>");
		if(ssc.nextLine().equals("y"))
		// 파일에서 기존 내용 읽어오고 그 내용을 myword 리스트에 저장
		read(myword,"/Users/gimdong-gyu/Desktop/무제 폴더/나의영한사전.txt");
		else 
			System.out.println("파일을 새로 만듭니다.");
	}catch(FileNotFoundException e1) {
		System.out.println("파일 읽는 중에 오류 발생하였습니다. -" + e1.getMessage());
	}
	
	
	String sel, eng, kor;
	int level;
	System.out.println("선택 기능 👉   1. 단어저장     2. 단어검색     3. 전체보기  4. 레벨로 검색   5.프로그램 끝내기");
	boolean run = true;
	while (run) { // while 반복안에 switch 로 종료조건을 동작시킬때 break 로 못합니다.-> 변수 사용했습니다.
		System.out.print("선택 ✏->");
		sel = sc.nextLine();
		switch (sel) {
		case "1": // switch문에서 case "문자열" 형식 가능. if문에서는 sel.equals("1") 로 해야합니다.
			System.out.print("English -> ");
			eng = sc.nextLine(); // sc.nextInt();
			System.out.print("한글 뜻 -> ");
			kor = sc.nextLine();
			System.out.println("레벨 -> ");
			level = Integer.parseInt(sc.nextLine());
			Word temp = new Word(eng,kor);
			temp.setLevel(level);
			myword.add(temp); // 저장
			
			break;
		case "2":
			System.out.print("검색 단어 English -> ");
			eng = sc.nextLine();
			for(Word w : myword)
				if(w.getEngilsh().equals(eng))
					System.out.println("단어장 검색했습니다. 결과 =>" + w);
//					for(int i= 0;i<myword.size();i++)
//						if(myword.get(i).getEngilsh().equals(eng))
//							System.out.println("검색결과 -> " + myword.get(i));
			break;
		case "3":
//					System.out.println("단어장 전체보기 :" + myword);
			all(myword);	// 정렬하고 출력하기
			break;
		
		case "4":
			System.out.println("검색할 레벨입력(1~3) -> ");
			int no = Integer.parseInt(sc.nextLine());
			level(myword,no);
			break;
		case "5":
			run = false;
			break;
		default:
			System.out.println("👁‍🗨잘못 입력된 선택입니다.1~4 입력입니다.");
			break;
		}
	} // while end
	try {
	System.out.println("파일에 저장할까요? (y or n) >>>");
	if(ssc.nextLine().equals("y"))
	save(myword,"/Users/gimdong-gyu/Desktop/무제 폴더/나의영한사전.txt");
	else
		System.out.println("파일이 저장되지 않았습니다.");
	} catch(FileNotFoundException e) {
		System.out.println("파일 저장 중에 오류가 생겼습니다. -" + e.getMessage());
	}
	System.out.println("::::  너의 단어장 종료합니다. ::::");
}


private static void save(List<Word> myword, String filename) throws FileNotFoundException{
	// 파일에 출력하기
	File file = new File(filename);
	PrintWriter pw = new PrintWriter(file);
	for(Word w : myword)
		pw.println(w);
	
	pw.close();
	System.out.println("파일 저장이 완료되었습니다.");
		}

private static void read(List<Word> myword, String filename)throws FileNotFoundException {
	File file = new File(filename);
	Scanner sc = new Scanner(file);
	StringTokenizer stk = null;
	while(sc.hasNext()) {
		String temp = sc.nextLine();		//파일에서 1줄 읽어온것 저장	
		System.out.println(temp.substring(0,temp.indexOf("(")));		//객체만들때 필요한 값만 가져오기 테스트
	//위의 결과를 참고로 StringTokenizer 로 Word 객체 만들고 myword 리스트에 추가하기
			//?? 코딩 완성되면 3번 전체보기 실행해보세요
	stk = new StringTokenizer(temp.substring(0,temp.indexOf("(")));
		myword.add(new Word(stk.nextToken(),	// english 필드값
							stk.nextToken(),	// korean 필드값
							Integer.parseInt(stk.nextToken()))	// level 필드값
				);
	}
	sc.close();
	System.out.println("파일 읽어오기 완료되었습니다.");
	
	
	
}

private static void level(List<Word> myword, int no) {
	
	for(Word w :myword)
		if(w.getLevel() == no)
			System.out.println(w);
//			for(int i =0; i<myword.size();i++)
//				if(myword.get(i).getLevel() == no)
//					System.out.println(myword.get(i));
}

private static void all(List<Word> myword) {	//myword 의 참조값 전달받아 동일한 객체를 기리킵니다.
	myword.sort(new Comparator<Word>() {

		
		public int compare(Word o1, Word o2) {
			return o1.getEngilsh().compareTo(o2.getEngilsh());
		}
	});
System.out.println(String.format("%-20s %-20s\t %10s" , "English","Korean","Level"));
	for(Word w : myword) {
		System.out.println(String.format("%-20s %-20s %10d" , w.getEngilsh(),w.getKorean(),w.getLevel()));
		}
	}
	
	
} // 참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
	// int score = Integer.parseInt(sc.nextLine());
	// 이유: nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
	// 결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.





