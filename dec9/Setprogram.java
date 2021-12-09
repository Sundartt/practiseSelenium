package dec9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setprogram {
	public static void main(String[] args) {
		Set<String> vij = new HashSet<String>();
		vij.add("Kumar");
		vij.add("Raj");
		vij.add("prabu");
		vij.add("karthik");
		//Converting set to list bcs set does not have index
		List<String> sun = new ArrayList<String>(vij);

		// Getting single value
		String value = sun.get(3);
		System.out.println(value);

		// Removing one value
		String remove = sun.remove(2);
		System.out.println(remove);

		// After removing  index
		System.out.println(sun);

	}

}
