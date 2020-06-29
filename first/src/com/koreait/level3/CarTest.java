package com.koreait.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		Car car1 = new Car("그랜저", "검정색", 3000); 	//생성자
		Car car2 = new Car("그랜저");
		Car car3 = new Car("G80");
		car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
		car3.introduceMyCar();
	}
}
