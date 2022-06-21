package day08;

import java.util.Random;

public class ToyCar extends Car{
		int battery = 100;
		
		public ToyCar() {}
		
		
		public ToyCar(String brand, String color,int price) {
			super(brand,color,price);
			
		}


		@Override
		void drive() {
			Random rd =new Random();
			battery -= rd.nextInt(40) + 10; // 0 ~ 50미만 까지의 난수 생성
			System.out.print(brand + ": 슈우웅...(배터리"+ battery +"%)");
		}
		
		void charging() {
			if(battery <= 70) {
				System.out.print(brand + ": 충전중 ....");
				try {					
					for(int i = 0;i<5 ;i++) {
						Thread.sleep(1000);
                       System.out.println(".");						
					}
				} catch (InterruptedException e) {
					battery = 100;
					System.out.println("\n 충전이 완료되었습니다. 현재 배터리" + battery+ "&입니다.");
				}
				return;
			}
			System.out.println("70% 이하일 경우만 충전 가능합니다.");
		} // method
		
		
		
}// class
