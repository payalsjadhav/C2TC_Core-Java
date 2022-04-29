package Day53collectionFramework;

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
	public boolean equals(Object o) {
		if(o instanceof collectionEmployee) {
			return ((collectionEmployee )o).id == this.id;
		}
			else
				return false;
		}
	/*@Override
	public int hashCode() {
		return id;
	}*/
	@Override
	public String toString() {
		return "collectionEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
