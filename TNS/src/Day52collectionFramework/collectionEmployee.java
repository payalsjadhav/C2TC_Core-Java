package Day52collectionFramework;

public class collectionEmployee {
	int id;
	String name;
	double salary;
	public collectionEmployee() {
		
	}
	public collectionEmployee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "collectionEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}