package package27.Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		
		
		LinkedHashMap lh = new LinkedHashMap();
		
		System.out.println("---LinkedHashMap---");
		System.out.println("Willnot allow duplicate values");
		System.out.println("Elements will print in insertion order");
		
		lh.put("Jonny", new Integer(4000));
		lh.put("Ally", new Integer(4500));
		lh.put("Ruby", new Integer(6000));
		lh.put("Jonny", new Integer(4700));
		lh.put("Carls", new Integer(3000));
		
		System.out.println("initial size is: " + lh.size());
		System.out.println("Initial Values are: " + lh.values());
		System.out.println("Get Ally: " + lh.get("Ally"));
		System.out.println("Intial Keys are: " + lh.keySet());
		System.out.println(lh.containsKey("Is the Map Contain Jordan: " + "Jordan"));
		
		Set myset1 = lh.entrySet();			
		
		Iterator it = myset1.iterator();
		
		while(it.hasNext()){
			
			Map.Entry entry = (Map.Entry) it.next();
			System.out.print(entry.getKey() + " : ");
			System.out.print(entry.getValue());
			System.out.println("\n");
		}
		
		System.out.println("Remove jonny: " + lh.remove("Jonny"));
		System.out.println("Now the size is: " + lh.size());
		System.out.println();
		
		SortedMap sm = new TreeMap();
		
		System.out.println("---TreeMap---");
		System.out.println("Elements will print in sorted order");
		sm.put("ABC", new Integer(3000));
		sm.put("XYZ", new Integer(3570));
		sm.put("PQR", new Integer(4000));
		sm.put("MNO", new Integer(7000));
		sm.put("ABC", new Integer(5000));
		
		
		Set myset2 = sm.entrySet();			
		
		Iterator it1 = myset2.iterator();
		
		while(it1.hasNext()){
			
			Map.Entry entry = (Map.Entry) it1.next();
			System.out.print(entry.getKey() + " : ");
			System.out.println(entry.getValue());
			
		}
		System.out.println("Initial values are: " + sm.values());
		System.out.println("Initial size is: " + sm.size());
		System.out.println("FirstKey is: " + sm.firstKey());
		
		/*double bal = ((Double)sm.get("PQR")).doubleValue();
	      sm.put("PQR", new Double(bal+1000));
	      System.out.println("PQR's new balance: " + sm.get("PQR"));*/
		
		System.out.println("Remove MNO: " + sm.remove("MNO"));
		System.out.println("Now the size is: " + sm.size());
		System.out.println("LastKey is: " + sm.lastKey());
		System.out.println("Checking the key: " + sm.putIfAbsent("RST", 3570));
		System.out.println("Replacing with newValue: " + sm.replace("ABC", 5000, 8000));
		System.out.println("After changing value the new values are: " + sm.values());
		
	}

}
