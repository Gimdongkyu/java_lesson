package koreait.test;
//작성자 김동규
public class Electronics extends Product{
	private double kwh;
	
	public Electronics() {
		
	}
	
	public Electronics(int price, String prdname) {
		this.price = price;
		this.prdName = prdname;
		
	}
	
	
	
	
	@Override
	public String sell(Object object) {

		
		return String.format("묶음 상품 %s (1set)", object);
	}

	public double power() {

		return getKwh()*24;
	}
 	
	

	public double getKwh() {
		return kwh;
	}


	
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	




}
