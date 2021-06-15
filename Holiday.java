package HomeWork;

public class Holiday {
	
	  public final int price;
	  public final String location;
	  public final int clientId;
	  
	  public Holiday(int price, String location, int clientId) {
	    super();
	    this.price = price;
	    this.location = location;
	    this.clientId = clientId;
	  }

	  @Override
	  public String toString() {
	    return "Holiday [price=" + price + ", location=" + location + ", clientId=" + clientId + "]";
	  }
	  
	  
	  
	}


