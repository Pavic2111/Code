package DayEleven.Homework;


public class TestLions {
	

	public static void main(String[] args) {
		 
	LittleCub[] lc1	= new LittleCub[] {
			
			new LittleCub(),
			new LittleCub(),
			new LittleCub(),
			new LittleCub(),
			
	};

	
	for(LittleCub  littlecub : lc1) {
		littlecub.BiteDmg(650);
		littlecub.run(80);
		littlecub.SeeInDark();
	}
	}
	
}
