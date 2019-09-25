package initial;

public class Regular extends Appliance {

	public Regular(int i, String n, double w, float p, boolean b) {
		super(i,n,w,p,b);
	}
	
	public Regular() {
		super();
	}

	public String ToString() {
		return( "Location ID: "+ this.getID() +"\n"+ " Name: " + this.getName() +"\n"+ "Watt usage: " + this.getWatt());
	}

}
