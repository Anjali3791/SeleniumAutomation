package functions;

public class User2 {

	public static void main(String[] args) {

		Car car1 = new Car("Swift", "Sedan", 4, "White"); //Obj creation of the class in which non static function lies
//		car1.name ="Swift";
//		car1.colour = "White";
//		car1.model = "Sedan";
//		car1.wheels = 4;
		car1.transport();
		car1.specification();
		
		
		Car car2 = new Car("I20", "Magna",4,"Black");
//		car2.name ="I20";
//		car2.colour = "Black";
//		car2.model = "Magna";
//		car2.wheels = 4;
		car2.transport();
		car2.specification();
		
		
		
		
	}

}
