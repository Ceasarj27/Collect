import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
/**
 * 
 * @author Cesar Jimenez
 *
 */
public class Collect {

	public static void main(String[] args) {
		/**
		 * 
    	 *Illustrate the following:
    	 *Show how you would use Set to find the unique elements in a List.
    	 *Show an example of HashMap and a TreeMap, and explain the difference. 
    	 *Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
		 */
		
		//Use set to find unique
		String unique = "unique";
		Set<String> setExample = new HashSet<String>();
		setExample.add("unique");
		System.out.println("Set contains unique is "+ setExample.contains(unique));
		
		/**
		 * HashMaps the order is not guaranteed 
		 */
		HashMap<String, Integer> hashExample = new HashMap<>(); 
		/**
		 * TreeMaps are sorted according to their keys i.e. alphabetically, numerically or by providing a Comparator.
		 */
		TreeMap<String, Integer> treeExample = new TreeMap<>();
		
		/**
		 * If you want to guarantee the order use either a LinkedHashMap that orders them in which they're inserted, 
		 * or a TreeMap that orders them by sorting the keys
		 */
		

	}

}
