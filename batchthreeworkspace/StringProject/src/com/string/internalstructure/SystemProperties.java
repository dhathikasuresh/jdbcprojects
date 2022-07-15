package com.string.internalstructure;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SystemProperties {

	public static void main(String[] args) {
		Properties obj = System.getProperties();
	Set<Entry<Object,Object>> set =	obj.entrySet();
	Iterator itr = set.iterator();
	while(itr.hasNext()) {
		Entry<Object,Object > entry = (Entry<Object, Object>) itr.next();
		System.out.println("Key : "  + entry.getKey()     +  "  Value :  " + entry.getValue());
	}

	}

}
