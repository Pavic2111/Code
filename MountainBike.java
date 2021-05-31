package HomeWork;

public class MountainBike extends Bikes {
	{

	if (color.contains("blu")) {
		System.out.println("the color is nearly guesed");
	} else if(color.contains("ue")) {
		System.out.println("this is some sort of color");
		
	}
	String n1;
	
	String  [] names = new String[5];
	

	names[0] = "Dragan";
	
	names[2] = "Consola";
	
	names[4] = "Debug";
	
	
	for (int i = 0; i < names.length; i++) {
		System.out.println(i);
	}
	boolean isExpensive= false;
	}
	
	public MountainBike(boolean isExpensive) {
		super();
		this.drive = 30;
	}
	 public String jump(int cm) {
  	 this.drive = drive + (2 * cm);
  	 return " i have jump " + (2 * cm) + " centimeters yesterday " + " and drived  " +   drive + " kilometers "; 		
	 } 
	 @Override
	public String toString() {
		return "I am a MountainBike.";
	}
	 
}
