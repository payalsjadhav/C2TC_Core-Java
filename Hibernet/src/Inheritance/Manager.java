package Inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

//single Table Inheritance
@DiscriminatorValue("MANAGER")

//Table per class Inheritance
//@Table(name = "manager")

public class Manager extends Employee 
{
	private static final long serialversionUID = 1L;
	
	
	//@Column(name = "Department Name")
	private String deptName;
	public Manager(){
		
	}
	public Manager(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
		
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
