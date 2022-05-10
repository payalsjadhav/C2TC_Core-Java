package Day61;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.Comparator;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student> al = new ArrayList<Student>();
		List <Student> la = new ArrayList<Student>();
		List <Student> lv = new Vector<Student>();
		List <Student> l = new LinkedList<Student>();
		
		Student s1 = new Student(1,"Alfiya",12);
		Student s2 = new Student(2,"Abhishek",13);
		Student s3 = new Student(3,"Aniket",14);
		Student s4 = new Student(4,"Chetan",13);
		Student s5 = new Student(5,"Harish",15);
		Student s6 = new Student(6,"Jyoti",18);
		Student s7 = new Student(7,"Kumendra",17);
		Student s8 = new Student(8,"Meraj",14);
		Student s9 = new Student(9,"Naseer",15);
		Student s10 = new Student(10,"Mohtasim",19);
		Student s11= new Student(11,"Moin",15);
		Student s12 = new Student(12,"Neha",14);
		Student s13 = new Student(13,"Payal",15);
		Student s14 = new Student(1,"Alfiya",12);
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
		Iterator <Student> it = al.iterator();
		while(it.hashNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
		Stream <Student> ss = al.stream();
		System.out.println(ss);
		System.out.println("------------------------------------------------------------------------");
		al.stream().forEach(System.out::println);
		System.out.println(al.stream().mapToDouble(Student::getMarks).average());
		OptionalDouble od = al.stream().filter(ls)-> s.getMarks()< 14).mapDouble(Student::Marks).average();
		System.out.println(od);
		System.out.println("Min Mark -" +al.Stream().min(Comparator.comparing(Student::getMarks)));
		System.out.println(al.stream().filter{(s) -> g.getMarks() < 20.map[(s) ->s.getMarks()].collect(collectors.toSet()));
		}
	}
}
