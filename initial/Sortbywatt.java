package initial;
import java.util.Comparator;

public class Sortbywatt implements Comparator<Appliance>{

	
	public int compare(Appliance a, Appliance b) {
		return (int) (b.getWatt() - a.getWatt());
	}

}
