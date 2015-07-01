package package27.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		System.out.println("Map will not allow duplicate values");
		System.out.println("No gurantee in the order of elements");
		
		HashMap hm = new HashMap();
		System.out.println("-----HashMap-----");
		hm.put("Jhon", new Integer (13));
		hm.put("ABC", new Integer (45));
		hm.put("Jordan", new Integer(29));
		hm.put("Rossy", new Integer (56));
		hm.put("Rossy", new Integer(78));
		
		Set myset = hm.entrySet();			
		
		Iterator it = myset.iterator();
		
		while(it.hasNext()){
			
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " : ");
			System.out.println(entry.getValue());
		}
		
		System.out.println("Size is: " + hm.size());
		System.out.println("Values are: " + hm.values());
		System.out.println("Is it empty: " + hm.isEmpty());
		System.out.println("Contains Key: " + hm.containsKey("Jessy"));
		System.out.println("Replace: " + hm.replace("ABC", 4567.2389, 23.567));
		System.out.println("Now values are: " + hm.values());
		System.out.println();
		
		
		Hashtable ht = new Hashtable();
		System.out.println("---Hashtable---");
		System.out.println("In Hashtable no gurantee of elements order");
		ht.put("Jury", new Double(36.64858));
		ht.put("Denny", new Double(48.6778));
		ht.put("Akash", new Double(1524.890));
		ht.put("Daisy", new Double(999.224));
		ht.put("Bruce", new Double(-169.098));
		
		Enumeration names = ht.keys();
	      while(names.hasMoreElements()) {
	         String str = (String) names.nextElement();
	         System.out.println(str + ": " +
	         ht.get(str));
	      }
	      
	      double bal = ((Double)ht.get("Jury")).doubleValue();
	      ht.put("Jury", new Double(bal+1000));
	      System.out.println("Jury's new balance: " +
	      ht.get("Jury"));
	      
	      System.out.println("Size is: " + ht.size());
	      System.out.println("Remove daisy: " + ht.remove("Daisy"));
	      System.out.println("Is daisy is there: " + ht.containsKey("Daisy"));
	      System.out.println("Values are: " + ht.values());
	     
		
		
		
		

		
		
	}

}
