package Inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSingleInheritance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e= new Employee();
		e.setEmpName("roshan");
		e.setEmpSalary(10000);
		em.persist(e);
		
		Manager m = new Manager();
		m.setEmpName("Payal");
		m.setEmpSalary(20000);
		m.setDeptName("Training");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Row Inserted");
		em.close();
		factory.close();
		
		
		
		
		
		

	}

}