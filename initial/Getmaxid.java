package initial;

import java.util.Comparator;

public class Getmaxid implements Comparator<Appliance> {

	@Override
	public int compare(Appliance a, Appliance b) {
		if(a.getID()<b.getID()) 
			return b.getID();
		if(a.getID()>b.getID())
			return a.getID();
		return a.getID();
	}

}
