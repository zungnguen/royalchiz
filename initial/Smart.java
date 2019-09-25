package initial;

public class Smart extends Appliance {
float probS;
public Smart(int i, String n, double w, float p, boolean b, float ps) {
	super(i,n,w,p, b);
	probS = ps;
}
public Smart() {
	super();
	probS = 0F;
}

public String ToString() {			
	return( "Location ID: "+ this.getID() +"\n"+ " Name: " + this.getName() +"\n"+ "Watt usage: " + this.getWatt() +""
			+ "\n"+ "Low Watt Usage: " + (this.getProbS()*this.getWatt()));
}


	public float getProbS() {
		return this.probS;
	}
	public void setProbs(float f) {
		if((f>0)&&(f<1.01F))
		this.probS = f;
		else {
			System.out.println("Improper float value");
		}
	}
}
