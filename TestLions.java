package DayEleven.Homework;
public class TestLions {
	public static void main(String[] args) {
		 
		
		LittleCub [] lions = new LittleCub[5];
    LittleCub l1	 = new LittleCub();
    lions[0	] = lions[1] =lions[2] = lions[3] =lions[4] = l1;
    
   
   for (LittleCub lions1 : lions) {
		System.out.println("how good hunter are they?:" + lions1.Hunting());
   }
   
   ILions[] lion = new ILions[5];
    for(int i = 0; i < lions.length; i++) {
    	lion[i]	= lions[i];
	
	}
}
}
