package HomeWork;

public class Female {
	String colorOfEyes;
	String n;
	int heigh;
	Integer i2= 22;

	Female(String colorOfEyes, int height,String name){
		this.colorOfEyes = name + " has color of eyes: " + colorOfEyes ;
		this.heigh = heigh;
	colorOfEyes = "some blue";
		this.n = name;
	}
	  	
	public String drive() {

		return this.n + " is driving";
	}
	public void sing() {
	System.out.println("a fimale with hight:" + heigh + " is singing");
			}
	public Female createNewFemaleObject(String color) {
		Female f1= new Female(null,2,color);
				f1.colorOfEyes = color;
				return f1;
	  }
	

}
