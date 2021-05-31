package HomeWork;

public class Male {
	
	String colorOfHair;
	 String n;
	 int height;
	 Integer i2 = 22;
	 int age;
	
	 
	 
  Male(String colorOfHair, int height,int age ,String name ){
	 this.colorOfHair =  name + " has color of hair: " + colorOfHair;
	 this.height = height;
	 this.age = age;
	 colorOfHair = "Green";
	 this.n= name;

	 
}
	 
  public String swim() {
 	 return this.n + " is swiming";
 	 
  }
	 
  
  public void StoryTeller() {
 	 System.out.println("a man with hight: " + height + " is telling story");
  }
  
  public Male createNewMaleObject(String color) {
 	 Male m1 = new Male(null,0,age, null);
 	 m1.colorOfHair = color;
 	 return m1;
  }
  
  


}

