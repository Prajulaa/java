package com.aiite.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMinMix {

	public static void main(String[] args) {

    int[] names = new int[]{2, 12,34, 65,0,-987, 12,743};
    List<Integer> list = new LinkedList<Integer>();
    
    for(int name: names) {
    	list.add(name);
    
    }
    
    System.out.println(list);
    System.out.println("Asc order using collections");
//    List<Integer> ordered = Collection.sort(list);


		
	}

}
