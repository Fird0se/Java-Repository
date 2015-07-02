package package27.Set;  
 
  
import java.util.LinkedHashSet;  
   
public class LinkedHashSetDemo {  
  
    public static void main(String[] args) {  
  
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();  
  
        System.out.println("Set will not allow duplicate values");
        System.out.println("Elements will print in insertion order");
        
        linkedset.add("Mury");  
        linkedset.add("Charls");  
        linkedset.add("Jordan");  
        linkedset.add("Audi");  
        linkedset.add("Mury");  
        linkedset.add("WalksWagon");  
  
        System.out.println("Size of LinkedHashSet=" + linkedset.size());  
  
        System.out.println("Initial LinkedHashSet:" + linkedset);  
  
        System.out.println("Removing Audi from LinkedHashSet: " + linkedset.remove("Audi"));  
  
        System.out.println("Trying to Remove Z which is not present: "+ linkedset.remove("BMW"));  
  
        System.out.println("Checking if Maruti is present=" + linkedset.contains("Mury"));  
  
        System.out.println("Updated LinkedHashSet: " + linkedset);  
  
  
  
    }  
  
}  