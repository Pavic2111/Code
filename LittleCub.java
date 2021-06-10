package DayEleven.Homework;

public class LittleCub  implements ILions , IBody , IFemaleLion{

	@Override
	public int BiteDmg(int biteforce) {
		System.out.println("The biteforce is up to" + biteforce);
		return 650;
	}


	public String Hunting() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int run(int kph) {
	System.out.println("they can run up to" + kph);
		return 80;
	}


	@Override
	public boolean SeeInDark() {
		System.out.println("they can see well in the dark");
		return true;
	}


	@Override
	public void OutPowerPray() {
		// TODO Auto-generated method stub
		
	}
}





	
	




	
	
	


