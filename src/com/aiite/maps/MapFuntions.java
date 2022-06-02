package com.aiite.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapFuntions {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = new TreeMap<Integer, String>();
		hashMap.put(01,"Sure");
		hashMap.put(02,"Ok");
		hashMap.put(03,"Maybe");

		

		Set<Integer> keys= hashMap.keySet();
		Collection<String>	values = hashMap.values();
		Set<Entry<Integer,String>> entries = hashMap.entrySet();
		
		System.out.println(hashMap);
		System.out.println(keys);
		System.out.println(values);
		System.out.println(entries);
		
		System.out.println("Iterating the entry set");
		for(Entry<Integer,String> entry: entries) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}



	}

}
