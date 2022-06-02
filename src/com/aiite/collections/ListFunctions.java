package com.aiite.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ListFunctions {

	public static void main(String[] args) {
		String[] arr = new String[-16];

		List<Integer> pricing = new LinkedList<Integer>();
		List<Integer> pricing2 = new LinkedList<Integer>();
		Set<Integer> pricing3 = new LinkedHashSet<Integer>();
		Set<Integer> pricing4 = new TreeSet<Integer>();
		List<String> menuItems = new Vector<String>();
		List<Double> pricingD = new ArrayList<Double>();

		//add item to the vector
		menuItems.add("dosa");
		menuItems.add("Biriyani");
		menuItems.add("Vegan Pasta");

		int index = menuItems.indexOf("dosa");
		System.out.println(index);



		//add item to a linked list
		pricing.add(23);
		pricing.add(2);
		pricing.add(23);
		pricing.add(11);
		pricing.set(0,44);
		pricing.set(2,44);
	
		

		//add items to the arraylist
		pricingD.add(23.02);
		pricingD.add(2.23);
		pricingD.add(23.443);
		pricingD.add(11.23);

		//add item to a linked list - sec list
		pricing2.add(11);
		pricing2.add(11);
		pricing2.add(11);
		pricing2.add(11);

		//add item to a set
		pricing3.add(11);
		pricing3.add(113);
		pricing3.add(114);
		pricing3.add(115);

		//add item to a set
		pricing4.add(11);
		pricing4.add(113);
		pricing4.add(114);
		pricing4.add(115);


		//remove an element from the list
		pricing.remove(3); // passing index
		pricing.remove(2); //this is removing the index and not the value
		pricingD.remove(2.23);
		menuItems.remove("Vegan"); //Only for objects boolean remove(Object o); method will be called for others the index value will be deleted

		pricing.add(1,100);
		pricing.set(1, 150);
		//pricing.remove(1);
		pricing.addAll(pricing2);
		pricing.retainAll(pricing2);
		pricing.addAll(pricing4);
		//		System.out.println(pricing.indexOf(11));
		//		System.out.println(pricing.lastIndexOf(11));
		//		System.out.println(menuItems.subList(1,2));
		//		System.out.println(pricing.contains(150));
		System.out.println("menu items" + menuItems);
		System.out.println("pricing" + pricing);
		System.out.println("pricing3" + pricing3);
		System.out.println("pricing4" + pricing4);
		System.out.println("pricingD" + pricingD);

	}

}
