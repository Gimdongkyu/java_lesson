package koreait.test;

	// 작성자 김동규
public class test {

	public static void main(String[] args) {
	
	Product[] cart = new Product[10];
	cart[0] = new Bike(123000,"MTB",25);
	cart[3] = new Bike(99000,"삼천리",13);
	cart[1] = new Electronics(35000, "Usb");
	cart[5] = new Electronics(130000, "ipad");
	cart[7] = new Electronics(225000,"lg 냉장고");
	
	((Electronics)cart[7]).setKwh(0.9);
	System.out.println(((Electronics)cart[7]).power());
	

	for(Product temp : cart) {
		if(temp != null && temp instanceof Bike) {
			Bike bik = (Bike)temp;
			System.out.println(bik.ride());
		}
			
	}
	
	
	
	
	for(int i =0;i<cart.length;i++) {
		if(cart[i]!= null && cart[i].price >= 100000 )
			System.out.println(cart[i]);
	}

	
	
		
	

	
		
	
	
	
	

	}
}
	
