package HomeWork;

public class TestFemale {
	public static void main(String[] args) {
		

		String coe = new String("brown");
		int hight = 169;
		Female f3 = new Female(coe,hight,"Dragan");
		
				String str1 = f3.drive();
				System.out.println(str1);
				Female f4 =f3.createNewFemaleObject("green");
}
}
