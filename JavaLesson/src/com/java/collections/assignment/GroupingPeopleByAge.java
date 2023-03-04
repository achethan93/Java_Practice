package com.java.collections.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingPeopleByAge {

	public static void main(String[] args) {
		List<People> people = new ArrayList<>();
		people.add(new People("Chethan", 24));
		people.add(new People("Kishanth", 22));
		people.add(new People("Prakruthi", 24));
		people.add(new People("Manoj", 18));
		people.add(new People("Kiran", 22));
		
		 Map<Integer, List<String>> groupingByAge = new HashMap<>();
		for (People person : people) {
			if (!groupingByAge.containsKey(person.getAge())) {
				groupingByAge.put(person.getAge(), new ArrayList<>());
			}
			groupingByAge.get(person.getAge()).add(person.getName());
		}
		
		System.out.println(groupingByAge.entrySet());
		for (Map.Entry<Integer, List<String>> entry : groupingByAge.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		System.out.println(groupingByAge.keySet());
		System.out.println(groupingByAge.get(24));
		for (int age : groupingByAge.keySet()) {
			List<String> names = groupingByAge.get(age);
			
			System.out.println("Age -> " + age);
			for ( String name : names) {
				System.out.println(name);	
			}
		}
		
	}
		
	}
	

class People {
	private String name; 
	private int age;
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}


