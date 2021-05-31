package HomeWork;

public class Bikes extends Object {
	public static void main(String[] args) {
	}
		
			 
			
			String type = "MountainBike";
			 int tires = 2;
			int drive = 15;
			String color = "blue";

	static int ObjectCounter = 0;

	public String jump(int cm) {

		this.drive = drive + cm;
		return " i have jump " + cm + " centimeters yesterday " + " and drived  " + drive + " kilometers ";

	}

	public Bikes(String color) {
		super();
		ObjectCounter++;
		this.color = color;
//		   }

//		   public static void set (int KidsRiding) {
//		  	 int maxKids = 50;
//		  	 int remainingKids = 0;
//		  	 System.out.println ("Kids Riding: " + KidsRiding);
//		  	 
//		  	 if (KidsRiding <= maxKids) {
//		  		 System.out.println("Today in the park are" +KidsRiding );
//		  	 } else {
//		  		 System.out.println("Today in the park there was: " +maxKids);
//		  		 remainingKids = KidsRiding - maxKids;

//		  	 }

		if (type.contains("2tires")) {
			System.out.println("this bike has 2 tires ");

		} else {
			System.out.println("this bike doesn't have 2 tires");
		}

		if (color.contains("bluee")) {
			System.out.println("that is the correct color of the bike");
		}

		switch (tires) {
		case 2:
			System.out.println("the bike has 2 tires");
			break;
		default:
			System.out.println("the bike dont have 1 tires");
			break;
		}
	}

	public Bikes () {
		  	 super();
		   }
}
		   
		   


