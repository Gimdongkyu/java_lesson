package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

public class MemberNameAscending implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		// name 필드 비교
//		String name1 = o1.getName();
//		String name2 = o2.getName();
//		return name1.compareTo(name2); // 오름차순
		return o1.getName().compareTo(o2.getName());
	}
	
	
}
