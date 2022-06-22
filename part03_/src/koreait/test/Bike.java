package koreait.test;
//작성자 김동규
public class Bike extends Product {
private int speed;



	public Bike() {
		
	}

	public Bike(int price,String prdname,int speed) {
		this.price = price;
		this.prdName = prdname;
		this.speed = speed;
	}
	
	@Override
	public String sell(Object object) {
	return	String.format("추가 할인 행사 - %d %% 인하", object);
	}
	
	
	public String ride() {
		setSpeed(speed);
	return "당신은 이것을 시속" + speed + "km 로 달릴수 있습니다.";
	}
	
	
	
	public int getSpeed() {
	return speed;
}





	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}

	


	


	
	
	
}
