package initial;

import java.util.Comparator;
public class Sortbyid implements Comparator<Appliance> {

	@Override
	public int compare(Appliance a, Appliance b) {
		return a.getID() - b.getID();
	}

}
