package com.dhathika.hashmaps;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

import com.dhathika.arraylists.Employee;
import com.dhathika.arraylists.Student;

public class MapTest {

	public static void main(String[] args) {
	Map<Integer,String> map = new HashMap(); // Map<Object,Object> map = new HashMap();
	map.put(1, "naresh");
	map.put(2,"vipina");
	map.put(3,"nandini");
	map.put(4,"sriman");
	map.put(5,"pawan kalyan");	
	map.put(-6,"pawan kalyan");
	map.put(null,"ramcharan");
	map.put(null,"ntr");
	map.put(7, null);
	map.put(8, null);
	
	System.out.println(map.size());
	
	Map<String,Integer> map1 = new HashMap<String, Integer>();
	map1.put("naresh", 15181);
	map1.put("sriman",-1);
	map1.put("nandini", 7070);
	map1.put("vipina", 007);
	
	Map<Integer,Student> stdMap = new ConcurrentHashMap<Integer, Student>();
	
	stdMap.put(1010,new Student(1010, "sriman", "kurnool"));
	stdMap.put(1026,new Student(1020, "srikanth", "kadiri"));
	stdMap.put(1042,new Student(1030, "sri harsha", "madanapalli"));
	stdMap.put(1058,new Student(1040, "srimukhi", "tanakal"));
	stdMap.put(1074,new Student(1050, "sri nandanan", "hyderabad"));
	stdMap.put(1080,new Student(1060, "sri chandana", "tanakal"));
	stdMap.put(1096,new Student(1070, "sri charan", "vepalapalli"));
	stdMap.put(1112,new Student(1080, "srimadan", "mulakalacheruvu"));
	stdMap.put(1128,new Student(1090, "sri sai", "tanakal"));
	stdMap.put(1144,new Student(1000, "sriram", "tanakal"));

	Iterator itr = stdMap.entrySet().iterator();
	while(itr.hasNext()) {
		itr.next();
		stdMap.remove(1010);
	}
	
//	Iterator itr = entryset.iterator();
//	while(itr.hasNext()) {
//		Map.Entry<Integer,Student> entry = (java.util.Map.Entry<Integer, Student>) itr.next();
//		System.out.println("key : " +  entry.getKey().hashCode());
//		System.out.println("value : " + entry.getValue().hashCode());
//	    stdMap.remove(1080);
//	}

//      Set<Integer> keys =  stdMap.keySet();
//      for(Integer key:keys) {
//    	  Student std =  stdMap.get(key);
//    	  System.out.println(std);
//      }
//      
//      Collection values  =  stdMap.values();
//     Iterator itr1 = values.iterator();
//     while(itr1.hasNext()) {
//    	 System.out.println(itr1.next());
//     }
//     
     
	
	Map<CityRank,City> chm = new TreeMap<CityRank,City>();

	  chm.put(new CityRank(20,"costalcity"), new City("Trivandrum","Kerala","India",697742));
   chm.put(new CityRank(1, "techcity"), new City("Hyderabad","Telangana","India",590056)); 
   chm.put(new CityRank(9,"hotcity"), new City("Anantapur","AndhraPradesh","India",515571));
   chm.put(new CityRank(3,"dreamCity"), new City("Mumbai","Maharastra","India",390056));

   
//   
//
//   Iterator itr2 = chm.entrySet().iterator();
//   while(itr2.hasNext()) {
//	   Map.Entry<String, City>  entry = (java.util.Map.Entry<String, City>) itr2.next();
//	   System.out.println(entry);	  
//	   }
//   
//   Hashtable<String,City> ht = new Hashtable();
//   String str1 = new String("sriman");
//   ht.put(str1, new City("Kadiri", "A.P", "India", 515573));
//   ht.put("naresh",new City("Kadiri", "A.P", "India", 515573));
////   ht.put("naresh1", null);
// 
//   
////    Map enumMap = new EnumMap<Enum<Integer>, String>(null)
//   ;
//   Map whm = new WeakHashMap<Integer, String>();

}
	
}
