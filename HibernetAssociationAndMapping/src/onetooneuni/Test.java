package onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Mansi");
		
		Address ad = new Address();
		ad.setAddressId(2);
		ad.setAddressLine1("2b 508");
		ad.setAddressLine2("Lower Parel");
		ad.setPincode(400025);
		ad.setState("MH");
	
		
		//ad.setEmployeeId(employee);
		
		employee.setEmployeeAddress(ad);
		
		
		em.persist(employee);	
		//em.persist(ad);
		
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
		
	}

}

