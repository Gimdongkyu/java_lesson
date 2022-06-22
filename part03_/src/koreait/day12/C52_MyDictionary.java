package koreait.day12;
import koreait.day16.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;


public class C52_MyDictionary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 키보드 입력시 nextLine() 과 nextInt() 등을 같이 쓰면 입력이 정상 실행 안됩니다.
//		HashMap<String, String> mydic = new HashMap<>();		//단어장 저장할 자료구조
		TreeMap<String, String> mydic = new TreeMap<String, String>(); // 이진 검색 가능한 구조로 Map 을 생성:정렬이되는 Map
		List<Word> myword = new ArrayList<>(); // **mydic을 myword로 바꿔서 구현해보기**
		String sel, eng, kor;
		System.out.println("선택 기능 👉   1. 단어저장     2. 단어검색     3. 단어장보기    4.프로그램 끝내기");
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
				myword.add(new Word(eng, kor)); // 저장
				break;
			case "2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				for(int i= 0;i<myword.size();i++)
					if(myword.get(i).getEngilsh().equals(eng))
						System.out.println("검색결과 -> " + myword.get(i));
				break;
			case "3":
				System.out.println("단어장 전체보기 :" + myword);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("👁‍🗨잘못 입력된 선택입니다.1~4 입력입니다.");
				break;
			}
		} // while end
		System.out.println("::::  너의 단어장 종료합니다. ::::");

	} // 참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
		// int score = Integer.parseInt(sc.nextLine());
		// 이유: nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
		// 결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.

}
