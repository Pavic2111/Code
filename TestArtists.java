package HomeWork;
import java.util.ArrayList;
import java.util.List;

public class TestArtists {
  public static void main(String[] args) {
  	 List<Artists> l = new ArrayList<Artists>();
     
    	 for(int i=0;i<1;i++){
         l.add(new  Metal ());
     }
     for(int i=0; i<3; i++){
         l.add(new PopArtist());
     }
     for(int i=0; i<2; i++){
         l.add(new JazzArtists());
     }
     for(Artists ls  : l){
       System.out.println(ls.speak());
       Artists.count(ls.speak());
       ls.NumbersOfAlbums();
     }
 }
}

