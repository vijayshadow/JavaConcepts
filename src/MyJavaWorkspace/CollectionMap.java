package MyJavaWorkspace;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMap {
	public static void hashMap() {
		Map<Integer, String> marks= new HashMap<Integer, String>();
		marks.put(100,"VIJAY");
		marks.put(101,"AKSHAYA");
		marks.put(102,"DEVIL");
		System.out.println("Marks of Vijay :  "+marks.get(100));
		
		
		 System.out.println("Iterating Hashmap... For INTEGER ");  
		   for(Map.Entry m : marks.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());
		   }
		    
		   
		    Map<String, Integer> mapretrive= new HashMap<String, Integer>();
		    mapretrive.put("MATHS", 80);
		    mapretrive.put("ENGLISH", 99);
		    mapretrive.put("PHYSICS", 66);
		    System.out.println("Iterating Hashmap... For STRING ");  
		    for(Map.Entry<String,Integer> sm :mapretrive.entrySet()) {
		    	System.out.println(sm.getKey()+"  "+sm.getValue());
		    
		   }  

	}
	public static void linkedHashMap() {
		 Map<Integer,String> map=new LinkedHashMap<Integer,String>();        
	     map.put(101,"Amit");     
	     map.put(102,"Vijay");    
	     map.put(103,"Rahul");    
	     System.out.println("Before invoking remove() method: "+map);     
	    map.remove(102);  
	    System.out.println("After invoking remove() method: "+map);    
	         

	}
	public static void treeMap() {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    

	}
	
	public static void map() {
		System.out.println("WORKING ON HASHMAP");
		hashMap();
		linkedHashMap();
		treeMap();
	}

}
