package koreait.day17;

public class Score {
private String name;
private int korean;
private int english;
private int science;
private String grade;


//기본생성자가 숨어 있습니다. 어떤 코드일까요? 접근한정자는? public
public Score() {
	
}


public Score(String name,int korean,int english,int science) {
	this.name =name;
	this.korean =korean;
	this.english =english;
	this.science =science;
}

// 인스턴스 메소드 객체의 값을 활용하는 메소드
public int sum() {
	int result = this.korean + this.korean + this.science;
//	setGrade();	//	 객체가 sum() 실행하면 setGrade 도 호출되어 실행
	return  result;		 	
}

public double average() {
	return (double)sum()/3;
}

//setter 를 변경하기: 실행내용. 필요에 따라서는 접근한정자를 private 으로도 할 수 있습니다.
private void setGrade() {
	if(average() >= 95) this.grade ="A";
	else if(average() >= 80) this.grade = "B";
	else if(average() >= 70) this.grade = "C";
	else if(average() >= 60) this.grade = "D";
	else this.grade="F";
}

String getGrade() {
	setGrade();
	return grade;
}
 void setSciesnce(int sciesnce) {
	this.science = sciesnce;
}

 int getSciesnce() {
	return science;
}

void setKorean(int korean) {
	this.korean = korean;
	// 메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
	// this는 setkorean 메소드 실행객체
}



int getKorean() {
	return korean;
}
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

void setEnglish(int english) {
this.english = english;	
}

int getEnglish() {
	return english;
}





@Override
public String toString() {
	return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science + ", grade="
			+ getGrade() + "]";
}



} // class
