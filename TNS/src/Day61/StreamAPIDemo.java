package Day61;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import Day53collectionFramework.collectionEmployee;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <collectionEmployee> al = new ArrayList<collectionEmployee>();
		List <collectionEmployee> la = new ArrayList<collectionEmployee>();
		List <collectionEmployee> lv = new Vector<collectionEmployee>();
		List <collectionEmployee> l = new LinkedList<collectionEmployee>();
		
		collectionEmployee s1 = new collectionEmployee(1,"Alfiya",12);
		collectionEmployee s2 = new collectionEmployee(2,"Abhishek",13);
		collectionEmployee s3 = new collectionEmployee (3,"Aniket",14);
		collectionEmployee s4 = new collectionEmployee(4,"Chetan",13);
		collectionEmployee s5 = new collectionEmployee(5,"Harish",15);
		collectionEmployee s6 = new collectionEmployee(6,"Jyoti",18);
		collectionEmployee s9 = new collectionEmployee(7,"Kumendra",17);
		collectionEmployee s8 = new collectionEmployee(8,"Meraj",14);
		collectionEmployee S9 = new collectionEmployee(9,"Naseer",15);
		collectionEmployee s10 = new collectionEmployee(10,"Mohtasim",19);
		collectionEmployee s11= new collectionEmployee(11,"Moin",15);
		collectionEmployee s12 = new collectionEmployee(12,"Neha",14);
		collectionEmployee s13 = new collectionEmployee(13,"Payal",15);
		collectionEmployee s14 = new collectionEmployee(1,"Alfiya",12);
		al.add(s1);
		al.add(s14);
		System.out.println(al.size());
		al.remove(s14);
		System.out.println(al.size());
		System.out.println(al.contains(s14));
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al.size());
		Iterator<collectionEmployee> it=al.iterator();
		while(it.hasNext())
		{
			collectionEmployee s =it.next();
			System.out.println(s);
		}
		Stream <collectionEmployee> ss = al.stream();
		System.out.println(ss);
		System.out.println("------------------------------------------------------------------------");
		al.stream().forEach(System.out::println);
		System.out.println(al.stream().mapToDouble(collectionEmployee::getSalary).average());
		OptionalDouble od = al.stream().filter((s) -> s.getSalary() < 14).mapToDouble(collectionEmployee::getSalary).average();
		System.out.println(od);
		System.out.println("Min Mark -" +al.stream().min(Comparator.comparing(collectionEmployee::getSalary)));
		System.out.println(al.stream().filter((s) -> s.getSalary() < 20).map((s) -> s.getSalary()).collect(Collectors.toSet()));
		
	}
}
