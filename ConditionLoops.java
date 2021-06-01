package HomeWork;

public class ConditionLoops {

	public static void main(String[] args) {
		
		Car[] cars = new Car[5];
		String cars1 = "MERCEDES";
		String cars2 = "BMW";
		String cars3	= "TOYOTA";
		String cars4 = "GOLF";
		String cars5 = "YUGO";
		System.out.println();
		
		if (cars1.equals("Mercedes")){
			System.out.println("its Mercedes");
		} else {
			System.out.println("it is not Mercedes");
		}
		switch (cars2) {
		case "BMW":
			System.out.println("it's BMW");
			break;
		case "TOYOTA":
			System.out.println("its TOYOYA");
			break;
		case "GOLF":
			System.out.println("its GOLF");
			break;
		case "YUGO":
			System.out.println("its YUGO");
			break;
		case "david":
			System.out.println("it is david");
			break;
		default:
			System.out.println("i do not what is that :)");
			break;
	}
		
		System.out.println();
	
		int j = 3;
		do {
			System.out.println("the name is: " + cars3);
			j++;
		} while (j < cars.length);
		
	for (int i = 0; i < cars.length; i++) {
		System.out.println("the name is: " + cars5);
}
}
}
	
	


	
		

	
