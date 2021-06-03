package HomeWork;

public abstract class Artists {
	 abstract String speak();
   abstract void NumbersOfAlbums();
   public static String count(String str){
       int count=0;
       char[] str1 = str.toCharArray();
       for(char c : str1){
           count++;
       }
       System.out.println("There are " + count + "  in my city.");
       return "";
   }
}

